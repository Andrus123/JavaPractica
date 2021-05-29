/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesgenericas;

/**
 *
 * @author Andrés Aquin
 */
public class Wallet {
    private double coin;
    private String coinname;
    private double valueusd;
    
    public Wallet(){
        this.coin = 500;
        this.coinname = "Bitcoin";
        this.valueusd = 45000;
    }

    public Wallet(double coin, String coinname, double valueusd) {
        this.coin = coin;
        this.coinname = coinname;
        this.valueusd = valueusd;
    }
    public void mostrar(){
        System.out.println("\nCoins: "+getCoin());
        System.out.println("CoinName: "+getCoinname());
        System.out.println("Value USD: "+getValueusd());
    }

    public double getCoin() {
        return coin;
    }

    public void setCoin(double coin) {
        this.coin = coin;
    }

    public String getCoinname() {
        return coinname;
    }

    public void setCoinname(String coinname) {
        this.coinname = coinname;
    }

    public double getValueusd() {
        return valueusd;
    }

    public void setValueusd(double valueusd) {
        this.valueusd = valueusd;
    }
    
    
}
