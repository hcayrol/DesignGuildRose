package edu;
import edu.insightr.gildedrose.Inventory;
import edu.insightr.gildedrose.Item;

import static org.junit.Assert.assertEquals;
public class TestInventory {

    protected Inventory inv;
    Item[] AncienneListedesItems;
    public void SetUp(){
        inv =new Inventory();
        AncienneListedesItems=inv.getItems();
    }

public void testUpdateQualitywhenSellINfinished()throws Exception{

        inv.updateQuality();
        Item[] items=inv.getItems();
        for(int i=0;i<items.length;i++){
            if(AncienneListedesItems[i].getSellIn()==0 )
            assertEquals(AncienneListedesItems[i].getQuality()-2,items[i].getQuality());
        }

}



}
