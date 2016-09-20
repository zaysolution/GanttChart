
function search() {

    $('#sponsoredAd div').remove();

    var keyword="keyword="+$("#keyword").val();
    $.getJSON({
        url:"search/adByKeyword",
        data:keyword,
        success:function (json) {
            for(var i = 0; i< json.length;i++){

                var $div4 = $("<div>").addClass("col-md-4 colunm").css("margin-top","15px");
                var $headingdiv = $("<div>").addClass("col-md-12 colunm");
                var $anchordiv = $("<div>").addClass("col-md-12 colunm");


                var $heading = $("<h>").html(json[i].advertiserId);
                var $a =$("<a>").addClass("ad")
                    .attr("href","#")
                    .attr("targetUrl",json[i].targetUrl)
                    .attr("campaignId",json[i].campaignId)
                    .attr("advertiserId",json[i].advertiserId)
                    .attr("customerId",json[i].customerId)
                    .attr("cost",json[i].cost)
                    .html(json[i].targetUrl);

                $heading.appendTo($headingdiv);
                $a.appendTo($anchordiv);

                $headingdiv.appendTo($div4);
                $anchordiv.appendTo($div4);

                $div4.appendTo("#sponsoredAd")
            }
        }
    });


    jQuery.ajax({
        url: '//freegeoip.net/json/',
        type: 'POST',
        dataType: 'jsonp',
        success: function(location) {

            console.log("city",location.city);
            console.log("country",location.country_name);
            // example where I update content on the page.
            // jQuery('#city').html(location.city);
            // jQuery('#region-code').html(location.region_code);
            // jQuery('#region-name').html(location.region_name);
            // jQuery('#areacode').html(location.areacode);
            // jQuery('#ip').html(location.ip);
            // jQuery('#zipcode').html(location.zipcode);
            // jQuery('#longitude').html(location.longitude);
            // jQuery('#latitude').html(location.latitude);
            // jQuery('#country-name').html(location.country_name);
            // jQuery('#country-code').html(location.country_code);
        }
    });

}


