//alert('test')
var btns = document.querySelectorAll('button');

function click() {
    //alert("클릭됨");

    //      var audio = new Audio('sounds/tom-1.mp3');
    // audio.play();

    console.log(this.textContent);
    // 7개의 버튼중 어떤 버튼을 눌렸는지 키값으로 판별

    drumBit(this.textContent);
}
//console.log(event.target)



// btn1.addEventListener('click',click);

// 모든 버튼에 이벤트 달기
// btns[0].addEventListener('click',click);
// btns[1].addEventListener('click',click);
// btns[2].addEventListener('click',click);

for (var i = 0; i < btns.length; i++) {
    btns[i].addEventListener('click', click);
}

// 전체화면에 키보드 이벤트 달기 
document.addEventListener('keypress', handlekey)

function handlekey(e) {
    //alert("키 눌렸음");
    //어떤 키보드 키를 눌렸는가
    //console.log(this); 항상 document 객체가 나온다
    //이벤트 객체는 addEventListen에 함수의 매개변수로 사용된다.
    console.log(e.key);
    drumBit(e.key);
}



function drumBit(key) {
    switch (key) {
        case 'w':
            var audio = new Audio('sounds/tom-1.mp3');
            audio.play();
            break;


        case 'a':
            var audio = new Audio('sounds/tom-2.mp3');
            audio.play();
            break;


        case 's':
            var audio = new Audio('sounds/tom-3.mp3');
            audio.play();
            break;


        case 'd':
            var audio = new Audio('sounds/tom-4.mp3');
            audio.play();
            break;


        case 'j':
            var audio = new Audio('sounds/snare.mp3');
            audio.play();
            break;


        case 'k':
            var audio = new Audio('sounds/crash.mp3');
            audio.play();
            break;


        case 'l':
            var audio = new Audio('sounds/kick-bass.mp3');
            audio.play();
            break;

        default:
            return; //위 키 외에 다른키가 입력되었을때 함수를 끝낸다
    }
    animationDrum(key);
}
function animationDrum(key) {
    //모든 버턴은 키 값과 같은 클래스를 가지므로 '.'클래스 이름으로 선택
    var btn = document.querySelector('.' + key); //키값에 해당하는 버튼을 선택 
    btn.classList.add('pressed');

    //0.1초 뒤에 클래스 제거
    setTimeout(function () {
        btn.classList.remove('pressed');
    }, 100);
}