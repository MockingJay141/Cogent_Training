package com.designPattern.facade;

public class RestaurantFacade {

    private Restaurant restaurant = new Restaurant();
    private DeliveryBoy deliveryBoy = new DeliveryBoy();
    private DeliveryTeam deliveryTeam = new DeliveryTeam();

    public void PlaceOrder(){
        restaurant.PrepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.PickUpOrder();
        deliveryBoy.DeliverOrder();
    }
}
