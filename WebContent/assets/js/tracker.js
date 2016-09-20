/**
 * Created by kibrom on 7/12/16.
 */
function tracker(trackerType,param1,param2,param3,param4,param5,param6,param7,param8){

    switch (trackerType){

        case 'trackClickAd':

            trackClickAd(param1,param2,param3,param4,param5);

            console.log("trackClick" + param1 + param2);

            break;
        case 'trackImpressionAd':

            trackImpressionAd(param1)

            break;
    }
}

function trackClickAd(param1,param2,param3,param4,param5) {

    var dataString = 'targetUrl='+ param1
                   + '&campaignId='+ param2
                   + '&advertiserId='+ param3
                   + '&customerId='+ param4
                   + '&cost='+ param5;
    $.ajax({
            type:"GET",
            url:"search/keyword",
            data:dataString,
            success:function (response) {
                console.log("success");
            }
    });
}

function trackImpressionAd(param1) {

}