package com.milleniumshopping.app.milleniumshopping.domain.internet;

import java.io.Serializable;

/**
 * Created by cfebruary on 2016/10/31.
 */
public class Fibre implements Serializable {
    private String ipAddress, ISP, planName;
    String price, dataAllowance;
    String type = "ADSL";
    private Internet nextInternetType;

    private Fibre(){}

    private Fibre(Builder builder)
    {
        this.ipAddress = builder.ipAddress;
        this.ISP = builder.ISP;
        this.planName = builder.planName;
        this.type = builder.type;
        this.price = builder.price;
        this.dataAllowance = builder.dataAllowance;
    }

    public String getIPAddress()
    {
        return ipAddress;
    }
    public String getISP()
    {
        return ISP;
    }
    public String getPlanName()
    {
        return planName;
    }
    public String getPrice()
    {
        return price;
    }
    public String getDataAllowance()
    {
        return dataAllowance;
    }
    public String getType(){return type;}
    public String toString()
    {
        return "IP address: " + getIPAddress() + "\nISP: " + getISP() + "\nPlan name: " + getPlanName()
                + "\nPrice: " + getPrice() + "\nData allowance: " + getDataAllowance() + "\nType: " + getType();
    }

    public static class Builder
    {
        private String ipAddress, ISP, planName;
        String price, dataAllowance, type;

        public Builder ipAddress(String value)
        {
            this.ipAddress = value;
            return this;
        }

        public Builder ISP(String value)
        {
            this.ISP = value;
            return this;
        }

        public Builder planName(String value)
        {
            this.planName = value;
            return this;
        }

        public Builder price(String value)
        {
            this.price = value;
            return this;
        }

        public Builder dataAllowance(String value)
        {
            this.dataAllowance = value;
            return this;
        }

        public Builder type(String value)
        {
            this.type = value;
            return this;
        }

        public Builder copy(Fibre value)
        {
            this.ipAddress = value.ipAddress;
            this.ISP = value.ISP;
            this.type = value.type;
            this.planName = value.planName;
            this.price = value.price;
            this.dataAllowance = value.dataAllowance;

            return this;
        }

        public Fibre build()
        {
            return new Fibre(this);
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;

        if(o == null || getClass() != o.getClass()) return false;

        Fibre internet = (Fibre) o;

        return ipAddress != null ? ipAddress.equals(internet.ipAddress) : internet.ipAddress == null;
    }

    @Override
    public int hashCode()
    {
        return ipAddress != null ? ipAddress.hashCode() : 0;
    }
}
