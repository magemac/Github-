import React from 'react';

import { Container, Nav, Navbar } from 'react-bootstrap';
const Header = () => {
  return (
    <Navbar bg="primary" variant="dark">
      <Container>
        <Navbar.Brand href="/">HOME</Navbar.Brand>
        <Navbar.Brand href="/post">글쓰기</Navbar.Brand>
        <Nav className="me-auto"></Nav>
      </Container>
    </Navbar>
  );
};

export default Header;
