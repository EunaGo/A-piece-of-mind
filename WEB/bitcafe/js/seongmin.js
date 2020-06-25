
var menuPage = $('.1>.swiper-wrapper');

// 동적 메뉴 생성

function initMenu(data) {
    var num = 10;
    var dnum = 100;
    var delNum = 0;


    for (var i = 0; i < data.length; i++) {

        if (i % 4 == 0) {
            var html = '';
            html += '<div class="swiper-slide">';
            html += '<div class="container">';
            html += `<div class="row ml-4 mt-4 menu menuList " id="${num}">`;
            html += `<div class="col-sm-5 ml-3 mt-3 menu1 ${data[i].id}" id="`+dnum+`">`;
            html += `<img class="hvr-grow" src=${data[i].img} class="rounded ${num}">`;
            html += `<div class="text-center mt-3">${data[i].name}</div>`;
            html += `<div class="text-center">&#8361;${data[i].price}</div>`;
            html += '</div>';
            html += '</div>';
            html += '</div>';
            html += '</div>';
            menuPage.append(html);
            num++;
            dnum++;
            delNum++;
        } else if (i % 4 != 0) {
            console.log(delNum);
            var manu = $(`#${num - 1}`);
            var html2 = '';
            html2 += `<div class="col-sm-5 ml-3 mt-3 menu1 ${data[i].id}" id="`+dnum+`">`;
            html2 += `<img class="hvr-grow ${i}" src=${data[i].img} class="rounded ${i}">`;
            html2 += `<div class="text-center mt-3">${data[i].name}</div>`;
            html2 += `<div class="text-center">&#8361;${data[i].price}</div>`;
            html2 += '</div>';
            manu.append(html2);
            dnum++;
        }


    }

    console.log(manu.html());

    // $('div[id~="100"]').click(function () {

    //     alert('hi');
    // });

    $('img').click(function(e){
        jsonParse();
        // console.log(e.target);
        
        
        
    });

}

// $(document).ready(function(){
//     $('div[id~="10"]').click(function () {

//         alert('hi');
//     });
// });




// JSON 파일 로드
function jsonParse() {
    $.getJSON('../json/coffee.json', function (data) {
        var coffees = data;
        console.log(coffees);
        initMenu(coffees);

        


    });
};



function init() {
    jsonParse();

    console.log(coffee.length);
}

init();