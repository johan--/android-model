package com.tb.wangfang.news.model.bean;

import java.util.List;

/**
 * Created by tangbin on 2017/11/8.
 */

public class SearchFilterListBean {
    /**
     * data : [{"id":"0","name":"学科分类","pId":"-1","value":"class_all","showName":"学科分类","facetField":"$subject_class_codes"},{"id":"TP","name":"自动化技术、计算机技术(53062)","pId":"T","value":"TP","showName":"自动化技术、计算机技术","count":53062,"facetField":"$subject_class_codes"},{"id":"T","name":"工业技术(53062)","pId":"0","value":"T","showName":"工业技术","count":53062,"facetField":"$subject_class_codes"},{"id":"TP3","name":"计算技术、计算机技术(50371)","pId":"TP","value":"TP3","showName":"计算技术、计算机技术","count":50371,"facetField":"$subject_class_codes"},{"id":"G","name":"文化、科学、教育、体育(37202)","pId":"0","value":"G","showName":"文化、科学、教育、体育","count":37202,"facetField":"$subject_class_codes"},{"id":"G4","name":"教育(10950)","pId":"G","value":"G4","showName":"教育","count":10950,"facetField":"$subject_class_codes"},{"id":"G43","name":"电化教育(7659)","pId":"G4","value":"G43","showName":"电化教育","count":7659,"facetField":"$subject_class_codes"},{"id":"TP2","name":"自动化技术及设备(1492)","pId":"TP","value":"TP2","showName":"自动化技术及设备","count":1492,"facetField":"$subject_class_codes"},{"id":"G42","name":"教学理论(1091)","pId":"G4","value":"G42","showName":"教学理论","count":1091,"facetField":"$subject_class_codes"},{"id":"F","name":"经济(971)","pId":"0","value":"F","showName":"经济","count":971,"facetField":"$subject_class_codes"},{"id":"F2","name":"经济计划与管理(971)","pId":"F","value":"F2","showName":"经济计划与管理","count":971,"facetField":"$subject_class_codes"},{"id":"F23","name":"会计(971)","pId":"F2","value":"F23","showName":"会计","count":971,"facetField":"$subject_class_codes"},{"id":"F239","name":"审计(971)","pId":"F2","value":"F239","showName":"审计","count":971,"facetField":"$subject_class_codes"},{"id":"e3ae12f59e494e1d8d89e0767575757a","showName":"清华大学","name":"清华大学(2003)","pId":"1510125744758$unit_name02","value":"清华大学","count":2003,"facetField":"$unit_name02","isHidden":"false"},{"id":"3238e8288c024f0da0587deff2dc0b35","showName":"浙江大学","name":"浙江大学(1719)","pId":"1510125744758$unit_name02","value":"浙江大学","count":1719,"facetField":"$unit_name02","isHidden":"false"},{"id":"7c9b9efad5384f6fa73afc68b58be07b","showName":"上海交通大学","name":"上海交通大学(1712)","pId":"1510125744758$unit_name02","value":"上海交通大学","count":1712,"facetField":"$unit_name02","isHidden":"false"},{"id":"a13cc40aa54b406f9b86cff3a28c0c2e","showName":"华中科技大学","name":"华中科技大学(1677)","pId":"1510125744758$unit_name02","value":"华中科技大学","count":1677,"facetField":"$unit_name02","isHidden":"true"},{"id":"b277664038e942c89f688f7f3931ab70","showName":"同济大学","name":"同济大学(1310)","pId":"1510125744758$unit_name02","value":"同济大学","count":1310,"facetField":"$unit_name02","isHidden":"true"},{"id":"1bb9b558131442649716048aa3095641","showName":"西安交通大学","name":"西安交通大学(1208)","pId":"1510125744758$unit_name02","value":"西安交通大学","count":1208,"facetField":"$unit_name02","isHidden":"true"},{"id":"013cabee5685436095d9dd7eac034025","showName":"吉林大学","name":"吉林大学(1182)","pId":"1510125744758$unit_name02","value":"吉林大学","count":1182,"facetField":"$unit_name02","isHidden":"true"},{"id":"322d0777f16a4b16a4b729f23899665b","showName":"武汉大学","name":"武汉大学(1160)","pId":"1510125744758$unit_name02","value":"武汉大学","count":1160,"facetField":"$unit_name02","isHidden":"true"},{"id":"792a70644c9d4bafad091e25ab22e634","showName":"东北大学","name":"东北大学(1122)","pId":"1510125744758$unit_name02","value":"东北大学","count":1122,"facetField":"$unit_name02","isHidden":"true"},{"id":"7d72dafcdeef4ff3ba963bb204c18e7d","showName":"哈尔滨工业大学","name":"哈尔滨工业大学(1041)","pId":"1510125744758$unit_name02","value":"哈尔滨工业大学","count":1041,"facetField":"$unit_name02","isHidden":"true"},{"id":"dc89b619771f4721a683f78f378c64a3","showName":"天津大学","name":"天津大学(992)","pId":"1510125744758$unit_name02","value":"天津大学","count":992,"facetField":"$unit_name02","isHidden":"true"},{"id":"50c64540463d4c5090957e4d0d0bdfd3","showName":"西北工业大学","name":"西北工业大学(969)","pId":"1510125744758$unit_name02","value":"西北工业大学","count":969,"facetField":"$unit_name02","isHidden":"true"},{"id":"9b5e42f255bd4487bba2d7ad5bf1174e","showName":"北京科技大学","name":"北京科技大学(933)","pId":"1510125744758$unit_name02","value":"北京科技大学","count":933,"facetField":"$unit_name02","isHidden":"true"},{"id":"e5ae15076acf452e941f4e8c35702410","showName":"北京航空航天大学","name":"北京航空航天大学(927)","pId":"1510125744758$unit_name02","value":"北京航空航天大学","count":927,"facetField":"$unit_name02","isHidden":"true"},{"id":"3ab8040bb11d4c0fa620d2c61e6ccdb2","showName":"华南理工大学","name":"华南理工大学(925)","pId":"1510125744758$unit_name02","value":"华南理工大学","count":925,"facetField":"$unit_name02","isHidden":"true"},{"id":"d5612df892a1437eabc7fa5ae6cb246d","showName":"重庆大学","name":"重庆大学(919)","pId":"1510125744758$unit_name02","value":"重庆大学","count":919,"facetField":"$unit_name02","isHidden":"true"},{"id":"eb16860a069347d584aff63e08e5ad1b","showName":"东南大学","name":"东南大学(892)","pId":"1510125744758$unit_name02","value":"东南大学","count":892,"facetField":"$unit_name02","isHidden":"true"},{"id":"4cd82e206bd243e98c60c8ffc5354cb1","showName":"中南大学","name":"中南大学(886)","pId":"1510125744758$unit_name02","value":"中南大学","count":886,"facetField":"$unit_name02","isHidden":"true"},{"id":"5cec48c4da854488bcfbf3e9129e4a87","showName":"武汉理工大学","name":"武汉理工大学(854)","pId":"1510125744758$unit_name02","value":"武汉理工大学","count":854,"facetField":"$unit_name02","isHidden":"true"},{"id":"e212c193a9804277968013532f34feaf","showName":"电子科技大学","name":"电子科技大学(841)","pId":"1510125744758$unit_name02","value":"电子科技大学","count":841,"facetField":"$unit_name02","isHidden":"true"},{"id":"8f0097effc9948589aa901794ab5d030","showName":"北京大学","name":"北京大学(787)","pId":"1510125744758$unit_name02","value":"北京大学","count":787,"facetField":"$unit_name02","isHidden":"true"},{"id":"91fb126bb41343618351bbe8bd6692ba","showName":"北京理工大学","name":"北京理工大学(783)","pId":"1510125744758$unit_name02","value":"北京理工大学","count":783,"facetField":"$unit_name02","isHidden":"true"},{"id":"c9cbe65f8d4f421cbec34a6718ff3975","showName":"中国矿业大学","name":"中国矿业大学(773)","pId":"1510125744758$unit_name02","value":"中国矿业大学","count":773,"facetField":"$unit_name02","isHidden":"true"},{"id":"4076789d6ef94079b6c39176804ca85a","showName":"山东大学","name":"山东大学(742)","pId":"1510125744758$unit_name02","value":"山东大学","count":742,"facetField":"$unit_name02","isHidden":"true"},{"id":"1535a97223d7477a9f85941054199914","showName":"大连理工大学","name":"大连理工大学(707)","pId":"1510125744758$unit_name02","value":"大连理工大学","count":707,"facetField":"$unit_name02","isHidden":"true"},{"id":"df200584f913422292e4e2853258de26","showName":"北京交通大学","name":"北京交通大学(687)","pId":"1510125744758$unit_name02","value":"北京交通大学","count":687,"facetField":"$unit_name02","isHidden":"true"},{"id":"e7694949c1f140aba3511b14483bd995","showName":"四川大学","name":"四川大学(683)","pId":"1510125744758$unit_name02","value":"四川大学","count":683,"facetField":"$unit_name02","isHidden":"true"},{"id":"1d93734c0eab4a7694e0b0e069f402e9","showName":"国防科学技术大学","name":"国防科学技术大学(630)","pId":"1510125744758$unit_name02","value":"国防科学技术大学","count":630,"facetField":"$unit_name02","isHidden":"true"},{"id":"8457e527ea404ecab1c9afd8c53b209f","showName":"中国科学技术大学","name":"中国科学技术大学(611)","pId":"1510125744758$unit_name02","value":"中国科学技术大学","count":611,"facetField":"$unit_name02","isHidden":"true"},{"id":"19044b4a325b4f2e9e88c5e32b8b5bfb","showName":"南京理工大学","name":"南京理工大学(600)","pId":"1510125744758$unit_name02","value":"南京理工大学","count":600,"facetField":"$unit_name02","isHidden":"true"},{"id":"d385849230ad438d83790c60bc39dc70","showName":"西南交通大学","name":"西南交通大学(576)","pId":"1510125744758$unit_name02","value":"西南交通大学","count":576,"facetField":"$unit_name02","isHidden":"true"},{"id":"6fd6df087cb943e8b0f461cafc4152c4","showName":"上海大学","name":"上海大学(574)","pId":"1510125744758$unit_name02","value":"上海大学","count":574,"facetField":"$unit_name02","isHidden":"true"},{"id":"e51174d344bf48e294e50090efc4b0dd","showName":"南京航空航天大学","name":"南京航空航天大学(539)","pId":"1510125744758$unit_name02","value":"南京航空航天大学","count":539,"facetField":"$unit_name02","isHidden":"true"},{"id":"7b8f3ed05a7442469757fb85590b27dd","showName":"苏州大学","name":"苏州大学(531)","pId":"1510125744758$unit_name02","value":"苏州大学","count":531,"facetField":"$unit_name02","isHidden":"true"},{"id":"b60c70ffbb424d88864c0957d67158bc","showName":"复旦大学","name":"复旦大学(529)","pId":"1510125744758$unit_name02","value":"复旦大学","count":529,"facetField":"$unit_name02","isHidden":"true"},{"id":"06942f4f5f604ae995b5027d9d2204a0","showName":"西安电子科技大学","name":"西安电子科技大学(513)","pId":"1510125744758$unit_name02","value":"西安电子科技大学","count":513,"facetField":"$unit_name02","isHidden":"true"},{"id":"88099c0360634265acd560ff292e2707","showName":"湖南大学","name":"湖南大学(498)","pId":"1510125744758$unit_name02","value":"湖南大学","count":498,"facetField":"$unit_name02","isHidden":"true"},{"id":"3142aff03e3747d9912e37990337d7be","showName":"中山大学","name":"中山大学(487)","pId":"1510125744758$unit_name02","value":"中山大学","count":487,"facetField":"$unit_name02","isHidden":"true"},{"id":"858a83a997524a47941440ba04b95937","showName":"北京工业大学","name":"北京工业大学(472)","pId":"1510125744758$unit_name02","value":"北京工业大学","count":472,"facetField":"$unit_name02","isHidden":"true"},{"id":"21f56c709ffc495ca2c7a8a62f686ee6","showName":"合肥工业大学","name":"合肥工业大学(464)","pId":"1510125744758$unit_name02","value":"合肥工业大学","count":464,"facetField":"$unit_name02","isHidden":"true"},{"id":"27639732968d495ba11f7b363a836da5","showName":"太原理工大学","name":"太原理工大学(459)","pId":"1510125744758$unit_name02","value":"太原理工大学","count":459,"facetField":"$unit_name02","isHidden":"true"},{"id":"ed63c6353c534c51ab4a2baf0d23b1ae","showName":"郑州大学","name":"郑州大学(456)","pId":"1510125744758$unit_name02","value":"郑州大学","count":456,"facetField":"$unit_name02","isHidden":"true"},{"id":"df4dfb9bcd674964b83c2f00b13e2452","showName":"北京师范大学","name":"北京师范大学(453)","pId":"1510125744758$unit_name02","value":"北京师范大学","count":453,"facetField":"$unit_name02","isHidden":"true"},{"id":"241f4d0263bc4168bb903259586e2053","showName":"中国人民银行","name":"中国人民银行(448)","pId":"1510125744758$unit_name02","value":"中国人民银行","count":448,"facetField":"$unit_name02","isHidden":"true"},{"id":"3545f11220c24a11876130a3d915af2a","showName":"哈尔滨工程大学","name":"哈尔滨工程大学(418)","pId":"1510125744758$unit_name02","value":"哈尔滨工程大学","count":418,"facetField":"$unit_name02","isHidden":"true"},{"id":"581384167bb64c13ba55adfb41f8c80e","showName":"广东工业大学","name":"广东工业大学(411)","pId":"1510125744758$unit_name02","value":"广东工业大学","count":411,"facetField":"$unit_name02","isHidden":"true"},{"id":"e21ed4bfc39d4746b9ed6aa894be0ea0","showName":"中国农业大学","name":"中国农业大学(407)","pId":"1510125744758$unit_name02","value":"中国农业大学","count":407,"facetField":"$unit_name02","isHidden":"true"},{"id":"f28906b6561a47129c909a8496604c66","showName":"吉林工商学院","name":"吉林工商学院(398)","pId":"1510125744758$unit_name02","value":"吉林工商学院","count":398,"facetField":"$unit_name02","isHidden":"true"},{"id":"37fe5572b19d4b7598bf435d30fa6688","showName":"长江大学","name":"长江大学(386)","pId":"1510125744758$unit_name02","value":"长江大学","count":386,"facetField":"$unit_name02","isHidden":"true"},{"id":"77cc2da51575478eabbefb02d48e0d52","showName":"华南师范大学","name":"华南师范大学(385)","pId":"1510125744758$unit_name02","value":"华南师范大学","facetField":"$unit_name02","count":385,"isHidden":"true"},{"id":"1510125744758$unit_name02","showName":"机构","name":"机构展开","pId":"-1","value":"机构","facetField":"$unit_name02","count":0},{"id":"36a987189a9d49a8bb7cb1caae1d0f13","showName":"王勇","name":"王勇(223)","pId":"1510125744767$authors_name","value":"王勇","count":223,"facetField":"$authors_name","isHidden":"false"},{"id":"a8e56553eab64d688f7051ed11e81012","showName":"张伟","name":"张伟(221)","pId":"1510125744767$authors_name","value":"张伟","count":221,"facetField":"$authors_name","isHidden":"false"},{"id":"8bd5b2f9bade46eb8f497e72a14ac9ed","showName":"王伟","name":"王伟(212)","pId":"1510125744767$authors_name","value":"王伟","count":212,"facetField":"$authors_name","isHidden":"false"},{"id":"a93a58dc0f9d437a8d7059f20587c1a1","showName":"刘伟","name":"刘伟(200)","pId":"1510125744767$authors_name","value":"刘伟","count":200,"facetField":"$authors_name","isHidden":"true"},{"id":"f032df2c1cab4b1b9a51bbd68c0d9e20","showName":"李斌","name":"李斌(192)","pId":"1510125744767$authors_name","value":"李斌","count":192,"facetField":"$authors_name","isHidden":"true"},{"id":"78d61fc47aac4a47a04eaf4209b775b4","showName":"李伟","name":"李伟(181)","pId":"1510125744767$authors_name","value":"李伟","count":181,"facetField":"$authors_name","isHidden":"true"},{"id":"8a614f581ad046658042c65f7284fb3a","showName":"李军","name":"李军(179)","pId":"1510125744767$authors_name","value":"李军","count":179,"facetField":"$authors_name","isHidden":"true"},{"id":"30b0275ed85d4a939b0adf7744de4c70","showName":"李强","name":"李强(178)","pId":"1510125744767$authors_name","value":"李强","count":178,"facetField":"$authors_name","isHidden":"true"},{"id":"9fba50f8ad604f14b60e38a4f9d7cf96","showName":"王磊","name":"王磊(163)","pId":"1510125744767$authors_name","value":"王磊","count":163,"facetField":"$authors_name","isHidden":"true"},{"id":"df9975a6a8b04f129e0349900a72e5a3","showName":"张健","name":"张健(155)","pId":"1510125744767$authors_name","value":"张健","count":155,"facetField":"$authors_name","isHidden":"true"},{"id":"f8ceb2efe4fa4e8e9a710a9ad9cbcb2e","showName":"李明","name":"李明(152)","pId":"1510125744767$authors_name","value":"李明","count":152,"facetField":"$authors_name","isHidden":"true"},{"id":"0f55dc16913843d9890019d712827df6","showName":"张磊","name":"张磊(151)","pId":"1510125744767$authors_name","value":"张磊","count":151,"facetField":"$authors_name","isHidden":"true"},{"id":"71e2803ed6ab4b0db939515bd5d09ea7","showName":"李敏","name":"李敏(148)","pId":"1510125744767$authors_name","value":"李敏","count":148,"facetField":"$authors_name","isHidden":"true"},{"id":"f51011b73a4b4006a672de455dcae648","showName":"李静","name":"李静(146)","pId":"1510125744767$authors_name","value":"李静","count":146,"facetField":"$authors_name","isHidden":"true"},{"id":"6870c9194b6942408f2331d7c02354e4","showName":"刘勇","name":"刘勇(145)","pId":"1510125744767$authors_name","value":"刘勇","count":145,"facetField":"$authors_name","isHidden":"true"},{"id":"9d359bcfd64541e2a68104a59aecb6b3","showName":"刘军","name":"刘军(143)","pId":"1510125744767$authors_name","value":"刘军","count":143,"facetField":"$authors_name","isHidden":"true"},{"id":"2aab364a97f747dd9f1b20feb704d1a5","showName":"张勇","name":"张勇(143)","pId":"1510125744767$authors_name","value":"张勇","count":143,"facetField":"$authors_name","isHidden":"true"},{"id":"ff950be16283454da905246bba21675e","showName":"王军","name":"王军(140)","pId":"1510125744767$authors_name","value":"王军","count":140,"facetField":"$authors_name","isHidden":"true"},{"id":"475287f2afb74454a706f78c6c041104","showName":"张鹏","name":"张鹏(139)","pId":"1510125744767$authors_name","value":"张鹏","count":139,"facetField":"$authors_name","isHidden":"true"},{"id":"e5bd2399cdde45d6b7fe3107b4c3d01a","showName":"李莉","name":"李莉(139)","pId":"1510125744767$authors_name","value":"李莉","count":139,"facetField":"$authors_name","isHidden":"true"},{"id":"f2c30d073d8e4539af219c46a88341ef","showName":"李刚","name":"李刚(138)","pId":"1510125744767$authors_name","value":"李刚","count":138,"facetField":"$authors_name","isHidden":"true"},{"id":"1c73af62e72f45e3a2dbdc5d04ceba5a","showName":"王静","name":"王静(138)","pId":"1510125744767$authors_name","value":"王静","count":138,"facetField":"$authors_name","isHidden":"true"},{"id":"4afd6ef522964a86bd5a65739885be2d","showName":"张静","name":"张静(136)","pId":"1510125744767$authors_name","value":"张静","count":136,"facetField":"$authors_name","isHidden":"true"},{"id":"ff553e6467734e44be7850e0275a19c3","showName":"李勇","name":"李勇(136)","pId":"1510125744767$authors_name","value":"李勇","count":136,"facetField":"$authors_name","isHidden":"true"},{"id":"d4f3b3474fb042f8bad830ce07b8afc9","showName":"张军","name":"张军(135)","pId":"1510125744767$authors_name","value":"张军","count":135,"facetField":"$authors_name","isHidden":"true"},{"id":"d725eb1cf4554ca5a500ad2d608ee3d9","showName":"王涛","name":"王涛(131)","pId":"1510125744767$authors_name","value":"王涛","count":131,"facetField":"$authors_name","isHidden":"true"},{"id":"1cde81c78f5146cb800e916b51bcda66","showName":"张颖","name":"张颖(129)","pId":"1510125744767$authors_name","value":"张颖","count":129,"facetField":"$authors_name","isHidden":"true"},{"id":"a6d34d26536145689fe46e2eb386ff8c","showName":"张莉","name":"张莉(128)","pId":"1510125744767$authors_name","value":"张莉","count":128,"facetField":"$authors_name","isHidden":"true"},{"id":"b6e99a1d77f64ce6aacc099f384c34fb","showName":"王强","name":"王强(127)","pId":"1510125744767$authors_name","value":"王强","count":127,"facetField":"$authors_name","isHidden":"true"},{"id":"05e810027bd144e4a070fc91479c74c1","showName":"李娜","name":"李娜(126)","pId":"1510125744767$authors_name","value":"李娜","count":126,"facetField":"$authors_name","isHidden":"true"},{"id":"0e7701d73b28446ab2355272b25d7e6b","showName":"张敏","name":"张敏(125)","pId":"1510125744767$authors_name","value":"张敏","count":125,"facetField":"$authors_name","isHidden":"true"},{"id":"2cac964116634be9af3e605068e733c3","showName":"刘涛","name":"刘涛(124)","pId":"1510125744767$authors_name","value":"刘涛","count":124,"facetField":"$authors_name","isHidden":"true"},{"id":"1626f16eeb4648c6bf71d92b895e1e69","showName":"李华","name":"李华(123)","pId":"1510125744767$authors_name","value":"李华","count":123,"facetField":"$authors_name","isHidden":"true"},{"id":"8f9b1cccddf44f0b92be0cc0f1a24a43","showName":"李娟","name":"李娟(123)","pId":"1510125744767$authors_name","value":"李娟","count":123,"facetField":"$authors_name","isHidden":"true"},{"id":"39cf0bf501d9490caf4ce225480ddc2d","showName":"王刚","name":"王刚(122)","pId":"1510125744767$authors_name","value":"王刚","count":122,"facetField":"$authors_name","isHidden":"true"},{"id":"12e7b22e802c45cebcb7f45218674257","showName":"刘洋","name":"刘洋(118)","pId":"1510125744767$authors_name","value":"刘洋","count":118,"facetField":"$authors_name","isHidden":"true"},{"id":"e5310977dbcc4b84b1b6d6a26d810fc4","showName":"王健","name":"王健(118)","pId":"1510125744767$authors_name","value":"王健","count":118,"facetField":"$authors_name","isHidden":"true"},{"id":"e99a47bd326a404cb6986e0d47d590ae","showName":"王斌","name":"王斌(118)","pId":"1510125744767$authors_name","value":"王斌","count":118,"facetField":"$authors_name","isHidden":"true"},{"id":"c47ca6afa3294cb996748c3bfe6775ff","showName":"张强","name":"张强(117)","pId":"1510125744767$authors_name","value":"张强","count":117,"facetField":"$authors_name","isHidden":"true"},{"id":"5b7a0f3fe98d4c759736ebc31e4de6f4","showName":"高峰","name":"高峰(117)","pId":"1510125744767$authors_name","value":"高峰","count":117,"facetField":"$authors_name","isHidden":"true"},{"id":"ffe3323ae59641a689e54853589a8ad6","showName":"张杰","name":"张杰(116)","pId":"1510125744767$authors_name","value":"张杰","count":116,"facetField":"$authors_name","isHidden":"true"},{"id":"eaab1929a07447b9b9bda86f33eebe07","showName":"李涛","name":"李涛(113)","pId":"1510125744767$authors_name","value":"李涛","count":113,"facetField":"$authors_name","isHidden":"true"},{"id":"104330aefcf7497b9f3dd4e0a8e73f0d","showName":"王芳","name":"王芳(113)","pId":"1510125744767$authors_name","value":"王芳","count":113,"facetField":"$authors_name","isHidden":"true"},{"id":"0c6c66a3a5c64d27931b0975c36e18a0","showName":"王颖","name":"王颖(112)","pId":"1510125744767$authors_name","value":"王颖","count":112,"facetField":"$authors_name","isHidden":"true"},{"id":"83bd40d79876434e8149eccf20daf019","showName":"张涛","name":"张涛(109)","pId":"1510125744767$authors_name","value":"张涛","count":109,"facetField":"$authors_name","isHidden":"true"},{"id":"93493acafe724ebb823dbc04c8abb982","showName":"张辉","name":"张辉(109)","pId":"1510125744767$authors_name","value":"张辉","count":109,"facetField":"$authors_name","isHidden":"true"},{"id":"292f71614cb345c8b7946f0a2540ea60","showName":"陈勇","name":"陈勇(109)","pId":"1510125744767$authors_name","value":"陈勇","count":109,"facetField":"$authors_name","isHidden":"true"},{"id":"99557fdbe003449dac22f62742cd665b","showName":"李宁","name":"李宁(108)","pId":"1510125744767$authors_name","value":"李宁","count":108,"facetField":"$authors_name","isHidden":"true"},{"id":"913606162d4246cd8312af372cd2abd4","showName":"王鹏","name":"王鹏(108)","pId":"1510125744767$authors_name","value":"王鹏","count":108,"facetField":"$authors_name","isHidden":"true"},{"id":"0bfcd0dd3c834d8186623b28d5d4c7f2","showName":"李波","name":"李波(107)","pId":"1510125744767$authors_name","value":"李波","facetField":"$authors_name","count":107,"isHidden":"true"},{"id":"1510125744767$authors_name","showName":"作者","name":"作者展开","pId":"-1","value":"作者","facetField":"$authors_name","count":0},{"id":"648daaf81c954506b471c1fef83761e2","showName":"汉语","name":"汉语(309353)","pId":"1510125744775$language","value":"chi","count":309353,"facetField":"$language","isHidden":"false"},{"id":"91e8b29c6e13458d8bb36325c61ba05b","showName":"英语","name":"英语(73)","pId":"1510125744775$language","value":"eng","count":73,"facetField":"$language","isHidden":"false"},{"id":"b9dd8e95afce4ff2b253c28f5d32078f","showName":"俄语","name":"俄语(25)","pId":"1510125744775$language","value":"rus","count":25,"facetField":"$language","isHidden":"false"},{"id":"e5f00147625a461daa3742b8b1db567c","showName":"日语","name":"日语(11)","pId":"1510125744775$language","value":"jpn","count":11,"facetField":"$language","isHidden":"true"},{"id":"f8038ea7e082427f926e0f621bff8119","showName":"德语","name":"德语(6)","pId":"1510125744775$language","value":"ger","count":6,"facetField":"$language","isHidden":"true"},{"id":"c77fdcb32a49441ea6ebf408e14c859e","showName":"波兰语","name":"波兰语(2)","pId":"1510125744775$language","value":"pol","count":2,"facetField":"$language","isHidden":"true"},{"id":"54c965a928db4c3ab7f0b6f300238ea9","showName":"法语","name":"法语(1)","pId":"1510125744775$language","value":"fre","count":1,"facetField":"$language","isHidden":"true"},{"id":"1510125744775$language","showName":"语种","name":"语种展开","pId":"-1","value":"语种","facetField":"$language","count":0}]
     * status : 200
     * message : success
     */

    private int status;
    private String message;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 0
         * name : 学科分类
         * pId : -1
         * value : class_all
         * showName : 学科分类
         * facetField : $subject_class_codes
         * count : 53062
         * isHidden : false
         */

        private String id;
        private String name;
        private String pId;
        private String value;
        private String showName;
        private String facetField;
        private int count;
        private String isHidden;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPId() {
            return pId;
        }

        public void setPId(String pId) {
            this.pId = pId;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getShowName() {
            return showName;
        }

        public void setShowName(String showName) {
            this.showName = showName;
        }

        public String getFacetField() {
            return facetField;
        }

        public void setFacetField(String facetField) {
            this.facetField = facetField;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getIsHidden() {
            return isHidden;
        }

        public void setIsHidden(String isHidden) {
            this.isHidden = isHidden;
        }
    }
}
