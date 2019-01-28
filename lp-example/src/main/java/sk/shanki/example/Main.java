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
                int prFrom = 0;
                int prTo = 999999;
                try {
                    prFrom = (priceFrom.getText().equals("") ? 0 : Integer.parseInt(priceFrom.getText()));
                } catch (NumberFormatException ex) {
                    errors.setText("Nezadal si korektne cislo v poli 'Cena od:'");
                }
                try {
                    prTo = (priceTo.getText().equals("") ? 999999 : Integer.parseInt(priceTo.getText()));
                } catch (NumberFormatException ex) {
                    errors.setText("Nezadal si korektne cislo v poli 'Cena do:'");
                }

                StringBuilder program = null;
                try {
                    program = new StringBuilder(Files.lines(Paths.get("C:\\Users\\jarof\\Documents\\01-Projects\\DDB\\lp-project\\lp\\lp-example\\cars.txt")).collect(Collectors.joining(System.lineSeparator())));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                ClingoSolver solver = new ClingoSolver();

                program.append(String.format("\ncena_od(%d).", prFrom));
                program.append(String.format("\ncena_do(%d).", prTo));

                program.append(String.format("vybrane_palivo(%d).", driveStyle.getSelectedIndex()));
                program.append(String.format("vybrany_nahon(%d).", driveRoad.getSelectedIndex()));
                program.append(String.format("vybrana_kategoria1(%d).", sitting.getSelectedIndex()));
                program.append(String.format("vybrana_kategoria2(%d).", family.getSelectedIndex()));

                AnswerSet as = solver.evaluateRaw(program.toString(), 0).first();

                String res = "";
                for (Literal literal : as) {
                    String lit = (automat.isSelected() ? "find_automat" : "find");
                    if (literal.isOfSymbol(lit)) {
                        Atom a = (Atom) literal;
                        String atomText = (a.getTerm(0) + "" + a.getTerm(1) + a.getTerm(2) + " v cene od " + a.getTerm(3)).replaceAll("\"", "");
                        res += atomText + "\n";
                        System.out.println(atomText);
                    }
                }
                res = res.equals("") ? "Pre vami vybrane kriteria sa nenaslo ziadne vhodne vozidlo" : res;


                results.setText(res);
                results.setEditable(false);
                JScrollPane scroll = new JScrollPane(results);
                JOptionPane.showMessageDialog(null, scroll);
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
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });

    }

}
