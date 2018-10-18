<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body{
            color: #666666;
        }
        .title {
            font-weight: bold;
            color: #000000;
        }
    </style>
</head>
<body>
<div style="width:50%;margin: auto">
    <h3>${title}</h3>
    <p style="color: #ffff00">名称：${user.name}</p>
    <div style="color: #ffff00">年龄：${user.id}</div>
    <br/>
    <div>《FreeMarker语法汇总》</div>
    <div class="title">声明变量cdate="自定义变量"</div>
    <#assign cdate="自定义变量"/>
    <div class="title">条件判断</div>

    <#if cdate??>
        <div>${cdate}</div>
     <#else>
        <div>变量未声明</div>
    </#if>

    <div class="title">字符串截取(原始字符串："字符串截取Demo")</div>
    <#assign str="字符串截取Demo"/>
    <div>截取索引为2的字符：${str[2]}</div>
    <div>截取区间2-5字符串：${str[2..5]}</div>
    <br/>

    <div class="title">算数运算（声明了两个变量a=5,b=8）</div>
    <#assign a=5/>
    <#assign b=8/>
    <div>"+":${a+b}</div>
    <div>"-":${a-b}</div>
    <div>"*":${a*b}</div>
    <div>"/":${a/b}</div>
    <div>"%":${a%b}</div>
    <br/>

    <div class="title">比较字符串</div>
    <div><#if a gte b>a大于等于b</#if></div>
    <div><#if a lt b>a小于b</#if></div>

    <div class="title">内建函数</div>
    <#assign HELLO="helloMari"/>
    <div>第一个字母大写:${HELLO?cap_first}</div>
    <div>所有字母小写：${HELLO?lower_case}</div>
    <div>所有字母大写：${HELLO?upper_case}</div>

    <#assign fnum=3.1415926/>
    <div>数值取整(3.1415926):${fnum?int}</div>
    <div>日期格式化：${datetime?string("yyyy-MM-dd")}</div>
    <div>获取列表长度${peoples?size}</div>
    <br/>
    <div class="title">遍历列表项：</div>
    <ul>
        <#list peoples as people>
            <li>人:${people.name}</li>
        </#list>
    </ul>

    <div class="title">遍历Map项key：</div>
    <ul>
       <#list employees?keys as key>
           <li>键:${key}---值:${employees[key].name}</li>
       </#list>
    </ul>

    <div class="title">遍历Map项value：</div>
    <ul>
        <#list employees?values as value>
            <li>值：${value.name}</li>
        </#list>
    </ul>

    <!--声明list集合-->
    <#assign listData=["ITDragon","blog","is","cool"]/>
    <!--引入其他ftl模板文件-->
    <div class="title">引入其他ftl模板文件：</div>
    <#include "hello-other-html.ftl"/>

    <!--宏命令（自定义标签）-->
    <div class="title">宏命令(自定义不带参数的标签)</div>
    <#macro customtag>
        <div>不带参数宏：${title}</div>
    </#macro>
    <@customtag/>
    <!--使用自定义不带参数的宏（标签）-->
    <div class="title">宏命令（自定义带参数的标签）</div>
    <#macro customtagp p0 p1 p2>
        <div>带参数宏：${title}--${p0}---${p1}---${p2}</div>
    </#macro>

    <@customtagp p0="参数0" p1="参数1" p2="参数2"/>

    <!--命名空间-->
    <#import  "hello-other-html.ftl" as other/>
    <div style="color: peru">${other.otherftl}</div>
</div>

</body>
</html>