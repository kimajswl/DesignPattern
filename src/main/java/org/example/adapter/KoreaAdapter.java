package org.example.adapter;

public class KoreaAdapter implements JapanPowerSocket{
    KoreaMachine koreaMachine;

    public KoreaAdapter(KoreaMachine koreaMachine) {
        this.koreaMachine = koreaMachine;
    }

    @Override
    public void JapanPowerSocketConnect(int voltage) {
        System.out.println(voltage + "v 일본 콘센트에 연결 성공");
    }
}
