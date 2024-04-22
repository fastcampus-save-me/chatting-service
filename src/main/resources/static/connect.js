let stompClient = null; // STOMP 클라이언트

function connect() { // WebSocket 연결 설정
  const socket = new SockJS("/chat"); // 엔드포인트 설정
  stompClient = Stomp.over(socket);

  stompClient.connect({}, function(frame) { // 연결 후 동작 설정
    console.log("Connected: " + frame);
  });
}

connect();