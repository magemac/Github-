import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import { postSave } from '../Store';
import { useSelector } from 'react-redux';
import { Form, Button, Container } from 'react-bootstrap';

const Update = (props) => {
  const dispatcher = useDispatch();
  const { posts } = useSelector((store) => store);

  console.log(1, posts);

  const [postDto, setPostDto] = useState({
    id: '',
    title: '',
    content: '',
  });

  console.log(postDto);

  const changeValue = (e) => {
    setPostDto({
      ...postDto,
      [e.target.name]: e.target.value,
    });
  };

  const submit = (e) => {
    e.preventDefault();
    dispatcher(postSave(postDto));
    props.history.push('/');
  };

  return (
    <Form>
      <Container>
        <div>
          <form>
            <br />
            <br />
            &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;I D &nbsp; &nbsp;{'  '}
            <input type="text" name="id" onChange={changeValue} />
            <br />
            <hr />
            <br />
            &nbsp; &nbsp;&nbsp;TITLE &nbsp;&nbsp;
            <input type="text" name="title" onChange={changeValue} />
            <br />
            <hr />
            <br />
            CONTENT <input type="text" name="content" onChange={changeValue} />
            <br />
            <hr />
            <br />
            <Button onClick={submit}>수정완료</Button>
          </form>
        </div>
      </Container>
    </Form>
  );
};

export default Update;
