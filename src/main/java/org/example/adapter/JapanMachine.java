package org.example.adapter;

public class JapanMachine implements JapanPowerSocket{
    public int JapanVoltage;

    public JapanMachine(int japanVoltage) {
        this.JapanVoltage = japanVoltage;
    }

    @Override
    public void JapanPowerSocketConnect(int voltage) {
        System.out.println(voltage + "v 일본 콘센트에 연결 성공");
    }
}
