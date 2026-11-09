import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class SortingVisualizerPanel extends JPanel {

    private ArrayList<Integer> list;
    private int currentIndex;

    public SortingVisualizerPanel(ArrayList<Integer> list) {
        this.list = list;
        setBackground(Color.BLACK);
    }

    public void setCurrentIndex(int index){
    	this.currentIndex = index;
    }

    public void setList(ArrayList<Integer> list){
    	this.list = list;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
 
        if (list == null || list.isEmpty()) {
            return;
        }

        int width = getWidth(); 
        int height = getHeight();
        int barWidth = Math.max(1, width / list.size());
 
        int maxVal = 1;
        for (int val : list) {
            if (val > maxVal) maxVal = val;
        }  
 
        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            int barHeight = (int) ((double) val / maxVal * (height - 30));
            int x = i * barWidth; 
            int y = height - barHeight; 
 
            g.setColor(new Color(51, 153, 255));
   
            if(!(SortingAlg.checkIfNotSort(list))){
            	g.setColor(new Color(144, 238, 144));
            } 

            if(currentIndex == i){
            	g.setColor(new Color(255, 193, 193));
            }
            g.fillRect(x, y, barWidth-1, barHeight);
        }
    }
}
