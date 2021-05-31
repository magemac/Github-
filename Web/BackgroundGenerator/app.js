//alert('테스트');

//사용할 태그요소 객체를 변수에 저장한다.

var body = document.getElementById('gradient')
var color1 = document.querySelector('.color1')
var color2 = document.querySelector('.color2')
var h3 = document.querySelector('h3')


// 이벤트를 연결한다.
color1.addEventListener('input',grad);

color2.addEventListener('input',grad);

    function grad(){
        body.style.background = "linear-gradient(to right, "+color1.value+" , "+color2.value+")";
    h3.textContent= body.style.background;
    }
    