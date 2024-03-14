package org.example.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        StationeryOrder stationeryOrder = new ProxyService();

        String[] person = {"철수", "짱구", "이슬이", "맹구"};
        String[] livingApply = {"가위", "색종이" ,"색연필", "물감"};

        stationeryOrder.order(person, livingApply);

    }
}
