package com.zay.ganttchart.controllers;

import com.zay.ganttchart.model.Country;
import com.zay.ganttchart.services.ProjectManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kibrom on 7/5/16.
 */
@RestController
@RequestMapping({"/search"})
public class SearchController {

//    @Autowired
//    ClickTrackerService clickTrackerService;
//
    @Autowired
      ProjectManagementService projectManagementService;
//
//
//    @RequestMapping(value = "/test")
//    public void test(){
//
//        SponsoredAd ad = new SponsoredAd();
//
//        ad.setAdvertiserId(2);
//
//        ad.setTargetUrl("www.test.com");
//
//        ad.setKeywords("phone");
//
//        Country country = new Country();
//
//        country.setCode("A5");
//
//        ad.setCountry(country);
//
//        searchEngineService.insert(ad);
//
//    }
//
//    @RequestMapping(value = "/adByKeyword")
//    public List<SponsoredAd>searchAdByKeyword(@RequestParam(value = "keyword",required = true) String keyword, HttpRequest request){
//
//
//        return searchEngineService.findSponsoredAdsByKeyword(keyword);
//
//    }
//    @RequestMapping(value = "/adByKeywordAndCategory")
//    public List<SponsoredAd>searchAdByKeywordAndCategory(@RequestParam String keyword,
//                                                         @RequestParam String category){
//
//        return searchEngineService.findSponsoredAdsByKeywordAndCategory(keyword,category);
//
//    }
//
//    @RequestMapping(value = "/keyword" ,method= RequestMethod.GET)
//    public List<SponsoredAd> registerClick(@RequestParam(value = "targetUrl",required = true)String targetUrl,
//                                           @RequestParam(value = "campaignId",required = true)int campaignId,
//                                           @RequestParam(value = "advertiserId",required = true)int advertiserId,
//                                           @RequestParam(value = "customerId",required = false)int customerId,
//                                           @RequestParam(value = "cost",required = false)float cost){
//
//        List<SponsoredAd> adList = searchEngineService.findSponsoredAdsByCriteria(120,110);
//
//        for(SponsoredAd ad : adList){
//
//            ad.setAmountUsed(110);
//
//            searchEngineService.update(ad);
//        }
//
//        return adList;
//    }
}
