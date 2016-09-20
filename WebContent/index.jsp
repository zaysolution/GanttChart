<html>
    <head>
        <%@ include file="include.jsp" %>
        <script src="<%=request.getContextPath()%>/assets/js/searchEngine.js"></script>
        <script src="<%=request.getContextPath()%>/assets/js/jquery-3.0.0.js"></script>
        <script src="<%=request.getContextPath()%>/assets/js/bootstrap.min.js"></script>
        <link href="<%=request.getContextPath()%>/assets/css/bootstrap.min.css" rel="stylesheet"></link>

    </head>
    <body>
        <div class="row clearfix" style="margin-top:30px">
            <div class="col-md-12 column">
                <div class="col-md-5 col-md-offset-3">
                    <img src="assets/image/habesha.jpg" style="margin-left:150px">
                </div>
            </div>
            <div class="col-md-12 column">
                <div class="col-md-5 col-md-offset-3">
                    <input id="keyword" type="text" class="form-control" placeholder="search">
                </div>
                <div class="col-md-3">
                    <button class="btn btn-primary" onclick="search()">Search</button>
                </div>
            </div>

            <div class="col-md-12 column" style="margin-top:30px">
                <div class="col-md-5 col-md-offset-3" id="sponsoredAd">
                </div>
            </div>
        </div>
        <div class="col-md-12 column">
            <div class="col-md-5 col-md-offset-3">
                <a href="<%=request.getContextPath()%>/search/test">Test Link</a>
            </div>
        </div>

    </body>

<script type="text/javascript">

    $(".ad").click(function () {
        var $targetUrl = $(this).attr('targetUrl').val();
        var $campaignId = $(this).attr('campaignId').val();
        var $advertiserId = $(this).attr('advertiserId').val();
        var $customerId = $(this).attr('customerId').val();
        var $cost = $(this).attr('cost').val();
        tracker('trackClickAd',$targetUrl,$campaignId,$advertiserId,$customerId,$cost);
    })

    var script = document.createElement('script');script.type="text/javascript";script.async=true;
    script.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'localhost:8080/ppc/assets/js/tracker.js';
    var s= document.getElementsByTagName('script')[0];s.parentNode.insertBefore(script,s);

</script>
</html>