package org.example.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        JapanMachine japanMachine = new JapanMachine(110);

        KoreaMachine koreaMachine = new KoreaMachine(220);

        JapanPowerSocket koreaAdapter = new KoreaAdapter(koreaMachine);

        testMachine(japanMachine, japanMachine.JapanVoltage);

        testMachine(koreaAdapter, koreaMachine.KoreaVoltage);
    }

    static void testMachine(JapanPowerSocket japanPowerSocket, int voltage) {
        System.out.println("\n");
        japanPowerSocket.JapanPowerSocketConnect(voltage);
    }
}
