//테스트
//alert('테스트');
//1. 이미지 태그를 선택 
//2. 주소 src 속성에 사진6의 주소를 넣는다.
var img1 = document.querySelector('.img1');
img1.setAttribute('src','images/dice6.p ng');
var img2 = document.querySelector('.img2');
img2.setAttribute('src', 'images/dice6.png');

//랜덤 숫자 1~6 만들기
var random1 = Math.floor(Math.random() * 6) + 1;
var random2 = Math.floor(Math.random() * 6) + 1;
console.log(random1);
console.log(random2);

img1.setAttribute('src','images/dice'+random1+'.png');
img2.setAttribute('src','images/dice'+random2+'.png');
var h1 = document.querySelector('h1');
if (random1>random2){
    h1.textContent= "player 1 win";
} else if (random2>random1){
    h1.textContent="player 2 win";
}else{
    h1.textContent="draw";
}




