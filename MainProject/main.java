package MainProject;

import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new window(); // 确保在EDT上创建和显示GUI
        });
    }
}
