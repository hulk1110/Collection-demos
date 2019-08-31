package com.collection.classes;

import static org.junit.Assert.*;

public class ShipmentTest {

    private Shipment shipment= new Shipment();

    @Test
    public  void shouldAddItems() throws Exception{
        shipment.add(door);
        shipment.add(window);
        assertThat(shipment,contains(door,window));
    }

    @Test
    public  void shouldReplaceItems() throws Exception{
        shipment.add(door);
        shipment.add(window);
        assertThat(shipment,contains(door,window));
    }

}