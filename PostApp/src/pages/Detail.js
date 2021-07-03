import React from 'react';
import { useSelector } from 'react-redux';
import { Form, Button, Container } from 'react-bootstrap';

const Detail = ({ match }) => {
  const id = match.params.id;
  const { posts } = useSelector((store) => store);
  const post = posts.filter((post) => post.id == id);
  const onRemove = () => {
    posts.filter((post) => post.id !== id);
    alert('삭제완료');
    window.location.href = 'http://localhost:3000/';
  };
  const onUpdate = () => {
    window.location.href = 'http://localhost:3000/post/:id/update';
  };
  return (
    <Form>
      <Container>
        <div>
          <br />
          <hr />
          <h1>글상세보기</h1>
          <hr />
          <br />
          <div>{post[0].id}</div>
          <hr />
          <br />
          <div>{post[0].title}</div>
          <br />
          <div>{post[0].content}</div>
          <br />
          <Button onClick={() => onRemove(post.id)}>삭제</Button>
          &nbsp; &nbsp;
          <Button onClick={() => onUpdate(post.id)}>수정</Button>
        </div>
      </Container>
    </Form>
  );
};

export default Detail;
