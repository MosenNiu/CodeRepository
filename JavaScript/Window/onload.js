/**
 * Created by Mosen on 2018/1/3.
 */

//方式一：一个页面只能存在一个window.onload
window.onload = function () {
    test1();
    test2();
}


// 方式二:使用监听的方式，注意事件为不带on的类型，即load, click等
window.addEventListener('load',test1);
window.addEventListener('load',test2);


//方式三：自己定义个方法，如果onload存在，则追加，之后调用这个方法添加window.onload
function addLoadEvent(func){
    var oldonload = window.onload; //把现在有window.onload事件处理函数的值存入变量oldonload。
    if(typeof window.onload != 'function'){ //如果这个处理函数还没有绑定任何函数，就像平时那样把新函数添加给它
        window.onload = func;
    }else{ //如果在这个处理函数上已经绑定了一些函数。就把新函数追加到现有指令的末尾
        window.onload = function(){
            oldonload();
            func();
        }
    }
}

addLoadEvent(test1);
addLoadEvent(test2);


function test1() {
    alert("页面加载完成1111");
}

function test2() {
    alert("页面加载完成2222");
}