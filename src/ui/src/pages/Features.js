import React,{ Component } from "react";
import { connect } from "react-redux";

const mapDispatchToProps=(dispatch)=>{
    return{
        setTitle:(title)=>{
            dispatch({type:"SET_TITLE",payload:title})
        }
    }

}

class ConnectedFeatures extends Component{
    state={
        title:"Features"
    }
   
    componentDidMount(){
        this.props.setTitle(this.state.title)
    }
    render(){
        return(
            <div>
                <h1>Features</h1>
            </div>
        )
    }
}


const Features=connect(null,mapDispatchToProps)(ConnectedFeatures)
export default Features;