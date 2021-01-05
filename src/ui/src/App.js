import React, { Component } from "react";
import { Switch, Route, Link } from "react-router-dom";
import Home from "./pages/Home";
import Application from "./pages/Application";
import ApplicationGroup from "./pages/ApplicationGroup";
import Features from "./pages/Features";
import Group from "./pages/Group";


const Container = () => (
  <main>
    <Switch>
      <Route path="/application" component={Application}></Route>
      <Route path="/applicationGroup" component={ApplicationGroup}></Route>
      <Route path="/features" component={Features}></Route>
      <Route path="/group" component={Group}></Route>
      <Route path="/" component={Home}></Route>
    </Switch>
  </main>
)

const Menu = () => (
  <ul className="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <Link className="dropdown-item" to="/">Home</Link>
    <Link className="dropdown-item" to="/application">Application</Link>
    <Link className="dropdown-item" to="/applicationGroup">ApplicationGroup</Link>
    <Link className="dropdown-item" to="/features">Features</Link>
    <Link className="dropdown-item" to="/group">Group</Link>
  </ul>
)


export default class App extends Component {
  render() {
    return (
      <main className="container container-height lr-shadow" >
        <div className="row border-bottom ">
          <div className="col-sm clearfix">
            <div className="title float-start">
              Flexi Features
            </div>
            <div className="dropdown">
              <button className="btn  dropdown-toggle rounded-0 title-btn" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
                <i className="fa fa-bars"></i>&nbsp;
                  </button>
              <Menu />
            </div>  
          </div>
          <div className="col-sm">
            <div className="text-center"><span className="align-bottom">Title</span></div>
          </div>
          <div className="col-sm text-right">
              <div className="dropdown float-end">
              <button className="btn btn-primary title-btn rounded-circle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
                 Me
              </button>
              <ul className="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <Link className="dropdown-item" to="/">logout</Link>
              </ul>
            </div>
          </div>
        </div>
        <div className="row">
          <Container />
        </div>
      </main>
    );
  }
}
