import React from 'react';
import { useSelector } from 'react-redux';
import { Link } from 'react-router-dom';
import { Form, Table, Container } from 'react-bootstrap';
const Main = () => {
  const { posts } = useSelector((store) => store);
  return (
    <Form>
      <Container>
        <div>
          <br />
          <hr />
          <h1>글목록보기</h1>
          <hr />
          <Table>
            <ul>
              {posts.map((post) => (
                <li key={post.id}>
                  <Link to={`/post/${post.id}`}>{post.title}</Link>
                  <hr />
                </li>
              ))}
            </ul>
          </Table>
        </div>
      </Container>
    </Form>
  );
};

export default Main;
