package com.zay.ganttchart.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kibrom on 7/5/16.
 */
@Entity
@Table(name ="ppc_ad")
public class SponsoredAd implements Serializable{

    private static final long serialVersionUID = -286830764275466043L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="advertiser_id")
    private int advertiserId;

    @Column(name="keywords")
    private String keywords;

    @Column(name ="maxamount")
    private float maxAmount;

    @Column(name ="amountused")
    private float amountUsed;

    @Column(name="targeturl")
    private String targetUrl;

    @Column(name="campaignId")
    private int campaignId;

    @OneToOne
    @JoinColumn(name="country")
    private Country country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(int advertiserId) {
        this.advertiserId = advertiserId;
    }

    public float getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(float maxAmount) {
        this.maxAmount = maxAmount;
    }

    public float getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(float amountUsed) {
        this.amountUsed = amountUsed;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public static SponsoredAd map(Object[] resultSet){

        SponsoredAd ad = new SponsoredAd();
        ad.setId((int)resultSet[0]);
        ad.setAdvertiserId((int)resultSet[1]);
        ad.setAmountUsed((float)resultSet[2]);
        ad.setMaxAmount((float)resultSet[3]);
        ad.setKeywords(resultSet[4].toString() != null ? resultSet[4].toString() : null);
        ad.setCampaignId((int)resultSet[5]);
        ad.setTargetUrl(resultSet[6].toString() != null ? resultSet[6].toString() : null);


        return ad;
    }

    public static List<SponsoredAd> mapList(List<Object[]> resultSet){

        List<SponsoredAd>adList = new ArrayList<>();

        for(Object[] object : resultSet){

            adList.add(map(object));
        }
        return adList;
    }
}
