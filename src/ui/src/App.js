import React, { Component } from "react";
import { Switch, Route, Link } from "react-router-dom";
import Home from "./pages/Home";
import Application from "./pages/Application";
import ApplicationGroup from "./pages/ApplicationGroup";
import Features from "./pages/Features";
import Group from "./pages/Group";
import { connect } from "react-redux";

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
  <div className="dropdown-menu rounded-3" aria-labelledby="dropdownMenuButton">
    <Link className="dropdown-item" to="/">Home</Link>
    <Link className="dropdown-item" to="/application">Application</Link>
    <Link className="dropdown-item" to="/applicationGroup">ApplicationGroup</Link>
    <Link className="dropdown-item" to="/features">Features</Link>
    <Link className="dropdown-item" to="/group">Group</Link>
  </div>
)

const mapStateToProps=(state)=>{
  return{
    title:state.title
  }
}

class ConnectedApp extends Component {
  render() {
    return (
      <main className="container container-height lr-shadow" >
        <div className="row border-bottom ">
          <div className="col-sm-5 col-md-4">
            <div className="dropdown float-start">
              <button className="btn btn-primary rounded-0 fs-5" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
                <i className="fa fa-bars"></i>
                  </button>
              <Menu />
            </div>  
            <div className="fs-3">
              &nbsp;Flexi Features
            </div>
          </div>
          <div className="col-sm">
            <div className="text-center fs-5">{this.props.title}</div>
          </div>
          <div className="col-sm-3">
              <div className="dropdown float-end">
              <button className="btn btn-secondary p-2 rounded-circle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
                 Me
              </button>
              <div className="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <Link className="dropdown-item" to="/">logout</Link>
              </div>
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

const App = connect(mapStateToProps,null)(ConnectedApp);

export default App