/**
 * Created by Mosen on 2017/9/4.
 */
/**
 * 自动将form表单封装成json对象
 */
$.fn.serializeObject = function() {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name]) {
            if (!o[this.name].push) {
                o[this.name] = [ o[this.name] ];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};


/**
 * 自动将form表单封装成json对象集合
 */
$.fn.serializeObject = function() {
    var array = [];
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (!o[this.name] && o[this.name]!='') {
            o[this.name] = this.value || '';
        } else {
            array.push(o);
            o={};
            o[this.name] = this.value || '';
        }
    });
    array.push(o);
    return array;
};