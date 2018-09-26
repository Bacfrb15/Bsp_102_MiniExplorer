package ex003;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author franz
 */
public class DateiModell extends AbstractListModel
{
    private ArrayList<Datei> dateien = new ArrayList();
    
    @Override
    public int getSize() {
        return dateien.size();
    }

    @Override
    public Datei getElementAt(int index) {
        return dateien.get(index);
    }

    public void changeDir(Datei selectedValue) {
        
    }
    
}
