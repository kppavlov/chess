import javax.swing.*;
import java.awt.*;

public class Board {
    private JPanel panel;

    private int cellCounter = 1;

    private boolean changeRowColorSequence = false;

    public final String[][] fields = {
            {"a", "8"}, {"b", "8"}, {"c", "8"}, {"d", "8"}, {"e", "8"}, {"f", "8"}, {"g", "8"}, {"h", "8"},
            {"a", "7"}, {"b", "7"}, {"c", "7"}, {"d", "7"}, {"e", "7"}, {"f", "7"}, {"g", "7"}, {"h", "7"},
            {"a", "6"}, {"b", "6"}, {"c", "6"}, {"d", "6"}, {"e", "6"}, {"f", "6"}, {"g", "6"}, {"h", "6"},
            {"a", "5"}, {"b", "5"}, {"c", "5"}, {"d", "5"}, {"e", "5"}, {"f", "5"}, {"g", "5"}, {"h", "5"},
            {"a", "4"}, {"b", "4"}, {"c", "4"}, {"d", "4"}, {"e", "4"}, {"f", "4"}, {"g", "4"}, {"h", "4"},
            {"a", "3"}, {"b", "3"}, {"c", "3"}, {"d", "3"}, {"e", "3"}, {"f", "3"}, {"g", "3"}, {"h", "3"},
            {"a", "2"}, {"b", "2"}, {"c", "2"}, {"d", "2"}, {"e", "2"}, {"f", "2"}, {"g", "2"}, {"h", "2"},
            {"a", "1"}, {"b", "1"}, {"c", "1"}, {"d", "1"}, {"e", "1"}, {"f", "1"}, {"g", "1"}, {"h", "1"},
    };

    void flipRowColorSequence(boolean isNextRow) {
        if (isNextRow) {
            changeRowColorSequence = !changeRowColorSequence;
        }
    }

    void writeBoard() {
        for (String[] field : fields
        ) {
            Field button = new Field( new ImageIcon("C:\\Users\\kaloy\\IntelliJIDEAProjects\\MyChess\\assets\\black-rook.png"));
            button.addActionListener(button);
            Color white = new Color(255, 255, 255);
            Color black = new Color(0, 0, 0);
            Color blackWhiteColorSequence = cellCounter % 2 != 0 ? black : white;
            Color whiteBlackColorSequence = cellCounter % 2 != 0 ? white : black;

            boolean isNextRow = field[0].equals("a");
            this.flipRowColorSequence(isNextRow);

            button.setBackground(changeRowColorSequence ? whiteBlackColorSequence : blackWhiteColorSequence);
            button.setFieldName(field[0] + field[1]);
            panel.add(button);
            cellCounter++;
        }
    }

    void createBoard() {
        JFrame frame = new JFrame();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setPreferredSize(new Dimension(800, 800));
        panel.setLayout(new GridLayout(8, 8));

        this.writeBoard();

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Chess");
        frame.pack();
        frame.setVisible(true);
    }
}
