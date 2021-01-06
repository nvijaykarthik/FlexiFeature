import React,{ Component } from "react";
import { connect } from "react-redux";

const mapDispatchToProps=(dispatch)=>{
    return{
        setTitle:(title)=>{
            dispatch({type:"SET_TITLE",payload:title})
        }
    }

}

class ConnectedApplication extends Component{
    state={
        title:"Application"
    }
   
    componentDidMount(){
        this.props.setTitle(this.state.title)
    }

    render(){
        return(
            <div className="row">
                <div className="col-sm-3">
                    Search
                </div>
                <div className="col-sm-9">
                    <h1>{this.state.title}</h1>
                </div>
                
            </div>
        )
    }
}

const Application=connect(null,mapDispatchToProps)(ConnectedApplication)

export default Application
