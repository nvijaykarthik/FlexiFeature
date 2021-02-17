import React, { Component } from "react";
import { connect } from "react-redux";

const mapDispatchToProps = (dispatch) => {
    return {
        setTitle: (title) => {
            dispatch({ type: "SET_TITLE", payload: title })
        }
    }

}

const Buttons=(props)=>(
    <div class="alert alert-info text-end p-1" role="alert">
        <button className="btn btn-sm">Save</button>
        <button className="btn btn-sm">New</button>
    </div>
)

class ConnectedApplication extends Component {
    state = {
        title: "Application"
    }

    componentDidMount() {
        this.props.setTitle(this.state.title)
    }

    render() {
        return (
            <div>
                <div className="row p-3">
                <div className="col-sm-3">
                    <div class="card text-center">
                        <div class="card-header">
                            Search
                        </div>
                        <div class="card-body">
                            <h5 class="card-title">Special title treatment</h5>
                            <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                        
                    </div>
                </div>
                <div className="col-sm-9">
              
                    <div class="card text-center">
                        <div class="card-body">
                            <h5 class="card-title">Special title treatment</h5>
                            <Buttons />
                            <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
            </div>
            </div>
            
        )
    }
}

const Application = connect(null, mapDispatchToProps)(ConnectedApplication)

export default Application
