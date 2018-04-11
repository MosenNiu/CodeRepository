/**
 * Created by Mosen on 2018/1/4.
 */
$.ajax({
    url:"factory",
    type:"POST",
    data:JSON.stringify($('#factory_form').serializeObject()),  //请求数据
    dataType:"json",        //返回数据类型
    contentType:"application/json;charset=utf-8",       //请求类型，post请求设置字符集
    scriptCharset:"json",       //只有当请求时dataType为"jsonp"或"script"，并且type是"GET"才会用于强制修改charset。通常只在本地和远程的内容编码不同时使用。
    success:function(data){},   //请求成功回调函数，传入返回数据
    error:function (XMLHttpRequest) {   //请求失败回调函数
        alert(JSON.parse(XMLHttpRequest.responseText).resMsg);  //显示返回json对象的信息
    }
});

$.ajax({
    url:"../combobox_huohao",
    type:"get",
    async:false,                //同步请求，默认true为异步请求
    data:{"changjia":encodeURI("厂家")},      //get请求用encodeURI将中文转码，后端相应的用URLDecoder.decode(factory,"utf-8")解码
    dataType:"json",
    success:function (data) {
        var newData = [];
        $.each(data, function(i) {
            newData.push({text:data[i],value:data[i]});
        });
        return newData;                     //方法返回值
    }
});