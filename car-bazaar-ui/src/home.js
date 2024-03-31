import React, { useEffect } from 'react'
import { useNavigate } from 'react-router-dom'
import VehicleList from './vehicle-list'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';

const Home = (props) => {
  const { loggedIn, email } = props
  const navigate = useNavigate();

  const onButtonClick = () => {
    if (loggedIn) {
      localStorage.removeItem('user')
      props.setLoggedIn(false)
    } else {
      navigate('/login')
    }
  }

  return (
    <div className="mainContainer">
      {/* old code */}
      <Navbar expand="lg" style={{ width : "100%"}} bg="dark" data-bs-theme="dark" className="bg-body-tertiary">
        <Container style={{ width: "100vw" }}>
          <Navbar.Brand href="#home">Car Bazaar</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link href="">Home</Nav.Link>
              <Nav.Link href="" onClick={onButtonClick}>{loggedIn ? 'Log out' : 'Log in'}</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <div className={'titleContainer'}>
        <div style = {{fontFamily: "cursive", color: "black"}}>Welcome to Car Bazaar!</div>
      </div>
      <div style = {{fontStyle: 'italic',
    fontFamily:'cursive'}}> "Rev up your search for the perfect ride at Car Bazaar: Where Every Mile Leads to Your Dream Drive!" </div>
      <div className={'buttonContainer'}>
        {loggedIn ?

          <VehicleList />

          : <div />}
      </div>
    </div>
  )
}

export default Home