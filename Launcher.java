import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
 
public class Launcher extends JFrame {
    private SortingVisualizerPanel panel;
    private ArrayList<Integer> list;

    public Launcher() { 
 
        //window creation
        setTitle("Array Sorting Visual");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 450);
        setLocationRelativeTo(null); 

        //list creation
        int amount = 350;
        list = new ArrayList<>();
        list = SortingAlg.randomNumber(amount, list);
 
        panel = new SortingVisualizerPanel(list);
        add(panel, BorderLayout.CENTER);
        setVisible(true); 

        //menu cration 
        JMenuBar menuBar = new JMenuBar();
        JPanel controlPanel = new JPanel();
        JMenu algoMenu = new JMenu("Algorithms");
   
        //BUTTON  
        JMenuItem quickSort = new JMenuItem("Quick Sort");
        quickSort.addActionListener(e ->{
            quickSort();   
        });

        JMenuItem bubbleSort = new JMenuItem("Bubble Sort");
        JButton resetButton = new JButton("Reset Array");
        bubbleSort.addActionListener(e ->{
            bubbleSort();
        }); 


        controlPanel.setBackground(Color.BLACK);

        resetButton.addActionListener(e -> {
		    list.clear();
		    list = SortingAlg.randomNumber(amount, list); 
		     
		    panel.setList(list);
		     
		    panel.repaint(); 
		});            
         
		controlPanel.add(resetButton);
		add(controlPanel, BorderLayout.NORTH);
        algoMenu.add(bubbleSort);
        algoMenu.add(quickSort);
        menuBar.add(algoMenu);
        setJMenuBar(menuBar); 
    }             

    private void quickSort() { 
        Thread sortThread = new Thread(() -> {
            try {
            	Thread.sleep(1000);
                int x = list.size() - 1;
                ArrayList<Integer> less = new ArrayList<>();
                ArrayList<Integer> more = new ArrayList<>();
                ArrayList<Integer> same = new ArrayList<>(); 

                while (SortingAlg.checkIfNotSort(list)) {
                    x--;
                    for (Integer item : list) {
                        if (list.get(x) > item) {
                            less.add(item);
                        } else if (list.get(x) < item) {
                            more.add(item);
                        } else {      
                            same.add(item);
                        }
                    }
                    list.clear(); 
                    list.addAll(less);
                    list.addAll(same);
                    list.addAll(more);
                    less.clear();
                    same.clear(); 
                    more.clear(); 
                    panel.setCurrentIndex(x);

                    SwingUtilities.invokeLater(() -> panel.repaint());

                    Thread.sleep(15);

                    if (x <= 0) {
                        x = list.size() - 1;
                    } 
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        });

        sortThread.start();
    }         

     private void bubbleSort() {
        Thread sortThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                int x = 0;
                int temp = 0; 

                while (SortingAlg.checkIfNotSort(list)) {
                    if(list.get(x) >list.get(x+1)){
                        temp = list.get(x);
                        list.set(x,list.get(x+1)); 
                        list.set((x+1),temp);        
                    } 
                    x++;    
                    if(x + 1 == list.size()){
                        x = 0;
                    } 
                    panel.setCurrentIndex(x);
                    SwingUtilities.invokeLater(() -> panel.repaint());
                    Thread.sleep(1);       
                }    
            } catch (InterruptedException e) {
                e.printStackTrace();   
            }  
        });     
            
        sortThread.start();      
    }
    
                    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Launcher());
    }
}