import java.awt.*; // все функции отсюда импортируем
import java.awt.event.*; // для отслеживания нажатий на кнопку
import javax.swing.*; // для формирования полей, форм и т.п..

public class App extends JFrame {
    public int a=0;
    public int b=0;
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result:" + a + " x "+ b);
    private JLabel scorer = new JLabel("Last Scorer: "+"N/A");
    private Label win = new Label("Winner: "+"DRAW");
    public App () {
        super("Football match"); // в констр-р класса JFrame передаём этот текс, этот текст - название поля приложения
        this.setBounds(100,100,250,100); // коор-ты, а также размеры поля приложения
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // когда приложение закроем - программа будет считаться выполненной
        Container Window =this.getContentPane(); // создание самого окна приложения
        Window.setLayout(new GridLayout(4,2,2,2)); // внутренности окна: ряды, колонки, отступы по вертикали и горизонтали
        button1.addActionListener(new Milan());
        Window.add(button1);
        button2.addActionListener(new RealMadrid());
        Window.add(button2);
        Window.add(result); // добавляем в окно приложения
        Window.add(scorer);
        Window.add(win);

    }
    class Milan implements ActionListener {
        public void actionPerformed(ActionEvent gl) {
            a = a + 1;
            result.setText("Result:" + a + " x " + b);
            scorer.setText("Last Scorer: " + "AC Milan");
            if (a > b)  win.setText("Winner: "+ "AC Milan");
            if (a < b)  win.setText("Winner: "+ "Real Madrid");
            if (a == b)  win.setText("Winner: "+ "DRAW");
        }
    }
    class RealMadrid implements ActionListener {
        public void actionPerformed (ActionEvent gl) {
            b=b+1;
            result.setText("Result:"+a+" x "+ b);
            scorer.setText("Last Scorer: "+"Real Madrid");
            if (a > b)  win.setText("Winner: "+ "AC Milan");
            if (a < b)  win.setText("Winner: "+ "Real Madrid");
            if (a == b)  win.setText("Winner: "+ "DRAW");
        }
    }
}
