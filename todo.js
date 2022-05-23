// 변수 선언부
const toDoForm = document.getElementById("todo-form");
const toDoInput = toDoForm.querySelector("input");
const toDoList = document.getElementById("todo-list");

//parameter와 argument의 차이를 모른다면 찾아보기 바랍니다!

function handleToDoSubmit(event) {
  // js가 발생한 이벤트를 event라는 parameter 받아오는 함수. (최하단 참조)
  event.preventDefault(); //기존 form submit event 방지 (기존에는 input태그에 엔터치면 form 전송이됨 이해안가면 빼고 해보기바람.)
  

  /* 이 밑부터 코드 작성 */



  // input의 현재 value를 새로운 변수 newTodo에 할당
  //input의 현재 값을 공백으로 없앰.
  //addToDo함수에 newTodo를 넘겨줌

}

function addToDo(newTodo) {
  /* 이 밑부터 코드 작성 */


  //li 와 span Element를 각각 만들어주고
  //span 안에 텍스트로써 newTodo를 넣어줌.
  //button Element를 만듦.
  //만든 button안에 "삭제" 라는 Text추가
  //button에 이벤트리스너를 추가하여 deleteToDo의 기능을 하게해줌.
  //각각의 요소들을 순서에맞게 appendChild 해줌.


}

function deleteToDo(event) {
  /* 이 밑부터 코드 작성 */

  //parameter로 전달받은 event의 부모를 선택하여 지움. (target 이용)

}


toDoForm.addEventListener("submit", handleToDoSubmit); 
//form에 submit, 즉 input을 작성하고 엔터를 누르면 handleToDoSubmit 함수 실행.




