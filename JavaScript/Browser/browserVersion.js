/**
 * Created by Mosen on 2017/7/27.
 */
//判断浏览器类型
function getBrowserType() {
    var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串

    if (userAgent.indexOf("Firefox") > -1) {
        return "Firefox";
    } else if (userAgent.indexOf("Edge") > -1) {
        return "Edge";
    } else if (userAgent.indexOf("Opera") > -1 || userAgent.indexOf("OPR") > -1) {
        return "Opera";
    } else if (userAgent.indexOf("Chrome") > -1) {
        return "Chrome";
    } else if (userAgent.indexOf("Safari") > -1) {
        return "Safari";
    } else if (userAgent.indexOf("MSIE") > -1 || userAgent.indexOf("Trident") > -1) {
        return "IE";
    }
}

//判断浏览器类型和版本
function getBrowserVersion() {
    var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串

    if (userAgent.indexOf("Firefox") > -1) {
        var version = userAgent.match(/firefox\/[\d.]+/gi)[0].match(/[\d]+/)[0];
        return "Firefox "+version;
    } else if (userAgent.indexOf("Edge") > -1) {
        var version = userAgent.match(/edge\/[\d.]+/gi)[0].match(/[\d]+/)[0];
        return "Edge "+version;
    } else if (userAgent.indexOf("Opera") > -1 || userAgent.indexOf("OPR") > -1) {
        if (userAgent.indexOf("Opera") > -1) {
            var version = userAgent.match(/opera\/[\d.]+/gi)[0].match(/[\d]+/)[0];
            return "Opera "+version;
        }
        if (userAgent.indexOf("OPR") > -1) {
            var version = userAgent.match(/opr\/[\d.]+/gi)[0].match(/[\d]+/)[0];
            return "Opera "+version;
        }
    } else if (userAgent.indexOf("Chrome") > -1) {
        var version = userAgent.match(/chrome\/[\d.]+/gi)[0].match(/[\d]+/)[0];
        return "Chrome "+version;
    } else if (userAgent.indexOf("Safari") > -1) {
        var version = userAgent.match(/safari\/[\d.]+/gi)[0].match(/[\d]+/)[0];
        return "Safari "+version;
    } else if (userAgent.indexOf("MSIE") > -1 || userAgent.indexOf("Trident") > -1) {
        if (userAgent.indexOf("MSIE") > -1) {
            var version = userAgent.match(/msie [\d.]+/gi)[0].match(/[\d]+/)[0];
            return "IE "+version;
        }
        if (userAgent.indexOf("Trident") > -1) {
            var versionTrident = userAgent.match(/trident\/[\d.]+/gi)[0].match(/[\d]+/)[0];
            var version = parseInt(versionTrident) + 4;
            return "IE "+version;
        }
    }
}




