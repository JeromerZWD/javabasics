package com.ecjtu.zwd.day21.test;



import com.ecjtu.zwd.day21.dao.ITicketDao;
import com.ecjtu.zwd.day21.dao.impl.Ticket_Station;
import com.ecjtu.zwd.day21.handler.TicketInvocationHandler;

import java.lang.reflect.Proxy;

public class TestTicket {
    public static void main(String[] args) {
        Ticket_Station station=new Ticket_Station();
        ITicketDao ticketDao =(ITicketDao) Proxy.newProxyInstance(TestTicket.class.getClassLoader(),station.getClass().getInterfaces(),new TicketInvocationHandler(station));
        ticketDao.buy();
    }
}
