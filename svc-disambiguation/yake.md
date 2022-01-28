### 接口：研究关键词提取
* 地址：http://47.106.211.96:5000/yake
* 类型：POST
* 状态码：200
* 简介：无
* Rap地址：[http://rap2.taobao.org/repository/editor?id=267630&mod=417319&itf=1764863](http://rap2.taobao.org/repository/editor?id=267630&mod=417319&itf=1764863)
* 请求接口格式：

```
Header:

├─ accept: application/json
├─ Content-type: application/json 

Body:

├─ language: String (语种, 可选值：en|zh)
├─ max_ngram_size: Number (关键词的最大长度)
├─ number_of_keywords: Number (结果集的大小)
└─ text: String (待分析的文本)

```

* 返回接口格式：

```
[
    {
        ngram: String (关键字),
        score: Number (得分，值越小，权重越高)
    },
    ...
]

```