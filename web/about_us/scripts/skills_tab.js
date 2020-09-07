$(document).ready(function() {

    KeepCycle();

    $("#skills_cycle").click(function() {
        // Redirect to the other page about which one skill user click.
        $("#software_skills_imgs").attr("src", "../about_us/software_logo_imgs/HTML5.png");
    });


    var FontEndID = null;
    var BackEndID = null;
    var CICDID = null;
    var OSIDEID = null;

    var i = 0;
    var FontEndImgs = ["HTML5.png", "CSS3.svg", "JSP.png", "javascript.png", "jquery.jpg"];
    var BackEndImgs = ["python.png", "Scala.png", "java.png", "node-js.png", "go-language.png", "akka-play-framework-actor-model.png", "Apache_Spark.png", "kafka.png"];
    var CICDImgs = [];
    var OSIDEImgs = [];

    function SkillsImgsCycle() {
        if (i == FontEndImgs.length) i = 0;
        $("#software_skills_imgs").attr("src", "../about_us/software_logo_imgs/font_end/" + FontEndImgs[i]);
        i ++;
    };

    function KeepCycle() {
        FontEndID = setInterval(function() {
            SkillsImgsCycle();
        }, 4000);
    };

});
