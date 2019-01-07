package sk.shanki.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import sk.shanki.lp.AnswerSet;
import sk.shanki.lp.Atom;
import sk.shanki.lp.solvers.ClingoSolver;
import sk.shanki.lp.Literal;

import javax.swing.*;

/**
 * @author jarof
 */
public class Main {

    private static class Config {
        public String pohon = "_";
        public String nahon = "_";
        public String kategoria;
        public String kategoria2;
        public int price_from;
        public int price_to;
        public ArrayList<String> kategorie = new ArrayList<>();
        public ArrayList<String> znacky = new ArrayList<>();
        public ArrayList<String> paliva = new ArrayList<>();
        public ArrayList<String> nahony = new ArrayList<>();
    }

    private static String find(String palivo, String nahon, String kategoria, int from, int to, boolean automat) {
        return (!automat ? String.format("find(M, N, N1, (C)) :- auto(X, M), palivo(%s, N1), nahon(%s, N), cena(X, %s, %s, C), %d <= C, %d >= C, auto_kategoria(X, %s).", palivo, nahon, nahon, palivo, from, to, kategoria, palivo, nahon) :
                String.format("find(M, N, N1, (C+P)) :- auto(X, M), palivo(%s, N1), nahon(%s, N), automat(Z, P), auto_znacka(X, Z), cena(X, %s, %s, C), %d <= (C+P), %d >= (C+P), auto_kategoria(X, %s).", palivo, nahon, nahon, palivo, from, to, kategoria, palivo, nahon));
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("Odporucac aut");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(800, 600);

        JLabel label = new JLabel("Naklikaj si svoje auto");
        label.setBounds(320, 20, 160, 30);
        frame.getContentPane().add(label);

        JLabel driveStylesLabel = new JLabel("Ake trasy jazdis?");

        String[] driveStyles = {"Kade tade", "Zapchy v meste", "Prevazne mesto niekedy mimo mesta", "Vacsinou okresky sem tam v meste", "Do mesta ani nepachnem"};

        JComboBox driveStyle = new JComboBox(driveStyles);


        JLabel driveRoadsLabel = new JLabel("Po akych komunikaciach jazdis?");

        String[] driveRoads = {"Rozne", "Len po udrziavanych komunikaciach", "Prevazne po udrziavanych, sem tam na hory", "Jazdim vela na hory", "Bybam na Orave!"};

        JComboBox driveRoad = new JComboBox(driveRoads);

        JLabel sittingLabel = new JLabel("Aky mas v aute posed?");

        String[] sittings = {"Je mi to jedno", "Rad mam pocit ze sedim na ceste", "Preferujem vyssie sedenie"};

        JComboBox sitting = new JComboBox(sittings);

        JLabel familyLabel = new JLabel("Kto bude jazdit v aute?");

        String[] familyEnum = {"Ako kedy", "Vacsinou sam, max dvaja", "Budem vozit celu rodinku"};

        JComboBox family = new JComboBox(familyEnum);

        JLabel priceFromLabel = new JLabel("Cena od:");
        JLabel priceToLabel = new JLabel("Cena do:");

        JTextField priceFrom = new JTextField(5);
        JTextField priceTo = new JTextField(5);

        JCheckBox automat = new JCheckBox("Automat");

        JLabel errors = new JLabel();
        errors.setHorizontalAlignment(SwingConstants.CENTER);

        JTextArea results = new JTextArea(20, 100);

        JButton findCar = new JButton("Vyhladaj!");
        findCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final Config config = new Config();
                switch (driveStyle.getSelectedIndex()) {
                    case 0:
                        config.pohon = "P1";
                        break;
                    case 1:
                        config.pohon = "hybrid";
                        break;
                    case 2:
                        config.pohon = "hybrid/benzin";
                        break;
                    case 3:
                        config.pohon = "P1";
                        break;
                    case 4:
                        config.pohon = "diesel";
                        break;
                    default:
                        config.pohon = "P1";
                        break;
                }

                switch (driveRoad.getSelectedIndex()) {
                    case 0:
                        config.nahon = "NA";
                        break;
                    case 1:
                        config.nahon = "dva";
                        break;
                    case 2:
                        config.nahon = "dva/styri";
                        break;
                    case 3:
                        config.nahon = "styri";
                        break;
                    case 4:
                        config.nahon = "styri";
                        break;
                    default:
                        config.nahon = "NA";
                        break;
                }

                switch (sitting.getSelectedIndex()) {
                    case 0:
                        config.kategoria = "_";
                        break;
                    case 1:
                        config.kategoria = "sedan_combi/hatchback";
                        break;
                    case 2:
                        config.kategoria = "suv/crossover";
                        break;
                    default:
                        config.kategoria = "_";
                        break;
                }

                switch (family.getSelectedIndex()) {
                    case 0:
                        config.kategoria2 = "_";
                        break;
                    case 1:
                        config.kategoria2 = "crossover/hatchback";
                        break;
                    case 2:
                        config.kategoria2 = "suv/sedan_combi/crossover";
                        break;
                    default:
                        config.kategoria2 = "_";
                        break;
                }

                try {
                    config.price_from = (priceFrom.getText().equals("") ? 0 : Integer.parseInt(priceFrom.getText()));
                } catch (NumberFormatException ex) {
//                TODO - vypis ze zadal nie cislo
                    errors.setText("Nezadal si korektne cislo v poli 'Cena od:'");
                }
                try {
                    config.price_to = (priceTo.getText().equals("") ? 99999 : Integer.parseInt(priceTo.getText()));
                } catch (NumberFormatException ex) {
                    errors.setText("Nezadal si korektne cislo v poli 'Cena do:'");
                }
                ArrayList<String> kat = new ArrayList<>();
                if (config.kategoria != null && !config.kategoria.equals("_")) {
                    kat.addAll(Arrays.asList(config.kategoria.split("/")));
                }
                if (config.kategoria2 != null && !config.kategoria2.equals("_")) {
                    if (kat.size() == 0) {
                        config.kategorie.addAll(Arrays.asList(config.kategoria2.split("/")));
                    } else {
                        for (String s : config.kategoria2.split("/")) {
                            if (kat.contains(s)) {
                                config.kategorie.add(s);
                            }
                        }
                    }
                } else {
                    if (kat.size() != 0) {
                        config.kategorie = kat;
                    }
                }
                if (config.kategorie.size() == 0) {
                    config.kategorie.add("_");
                }
                config.paliva.addAll(Arrays.asList(config.pohon.split("/")));
                config.nahony.addAll(Arrays.asList(config.nahon.split("/")));

                StringBuilder program = null;
                try {
                    program = new StringBuilder(Files.lines(Paths.get("C:\\Users\\jarof\\Documents\\01-Projects\\DDB\\lp-project\\lp\\lp-example\\cars.txt")).collect(Collectors.joining(System.lineSeparator())));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                ClingoSolver solver = new ClingoSolver();

                for (String palivo : config.paliva) {
                    for (String nahon : config.nahony) {
                        for (String kategoria : config.kategorie) {
                            program.append("\n" + find(palivo, nahon, kategoria, config.price_from, config.price_to, automat.isSelected()));
//                            System.out.println(find(palivo, nahon, kategoria, config.price_from, config.price_to));
                        }
                    }
                }

                AnswerSet as = solver.evaluateRaw(program.toString(), 0).first();

                String res = "";
                for (Literal literal : as) {
                    if (literal.isOfSymbol("find")) {
                        Atom a = (Atom) literal;
                        String atomText = (a.getTerm(0) + "" + a.getTerm(1) + a.getTerm(2) + " v cene od " + a.getTerm(3)).replaceAll("\"", "");
                        res += atomText + "\n";
                        System.out.println(atomText);
                    }
                }
                res = res.equals("") ? "Pre vami vybrane kriteria sa nenaslo ziadne vhodne vozidlo" : res;


//                results.setBounds(730, 50, 450, 500);
                results.setText(res);
                results.setEditable(false);
                JScrollPane scroll = new JScrollPane(results);
                JOptionPane.showMessageDialog(null, scroll);
//                frame.getContentPane().add(results);
            }
        });



        driveStylesLabel.setBounds(10, 50, 300, 30);
        frame.getContentPane().add(driveStylesLabel);
        driveStyle.setBounds(410, 50, 300, 30);
        frame.getContentPane().add(driveStyle);

        driveRoadsLabel.setBounds(10, 100, 300, 30);
        frame.getContentPane().add(driveRoadsLabel);
        driveRoad.setBounds(410, 100, 300, 30);
        frame.getContentPane().add(driveRoad);

        sittingLabel.setBounds(10, 150, 300, 30);
        frame.getContentPane().add(sittingLabel);
        sitting.setBounds(410, 150, 300, 30);
        frame.getContentPane().add(sitting);

        familyLabel.setBounds(10, 200, 300, 30);
        frame.getContentPane().add(familyLabel);
        family.setBounds(410, 200, 300, 30);
        frame.getContentPane().add(family);

        priceFromLabel.setBounds(10, 250, 300, 30);
        frame.getContentPane().add(priceFromLabel);
        priceFrom.setBounds(410, 250, 300, 30);
        frame.getContentPane().add(priceFrom);

        priceToLabel.setBounds(10, 300, 300, 30);
        frame.getContentPane().add(priceToLabel);
        priceTo.setBounds(410, 300, 300, 30);
        frame.getContentPane().add(priceTo);

        automat.setBounds(350, 350, 300, 30);
        frame.getContentPane().add(automat);

        errors.setBounds(10, 490, 770, 30);
        frame.getContentPane().add(errors);

        findCar.setBounds(10, 530, 770, 30);
        frame.getContentPane().add(findCar);


        frame.setLayout(null);
        frame.setVisible(true);
    }


    public static void main(String[] args) throws IOException {
//		StringBuilder program = new StringBuilder(Files.lines(Paths.get("C:\\Users\\jarof\\Documents\\01-Projects\\DDB\\lp-project\\lp\\lp-example\\cars.txt")).collect(Collectors.joining(System.lineSeparator())));
//		ClingoSolver solver = new ClingoSolver();
//
//		AnswerSet as = solver.evaluateRaw(program.toString(), 0).first();
//
//		for (Literal literal : as) {
//			if (literal.isOfSymbol("find")) {
//				Atom a = (Atom) literal;
//				System.out.println(a.getTerm(0));
//			}
//		}

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });

    }

}