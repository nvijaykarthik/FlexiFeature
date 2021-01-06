import React,{ Component } from "react";
import { connect } from "react-redux";


const mapDispatchToProps=(dispatch)=>{
    return{
        setTitle:(title)=>{
            dispatch({type:"SET_TITLE",payload:title})
        }
    }

}
 class ConnectedApplicationGroup extends Component{
    state={
        title:"Application Group"
    }
   
    componentDidMount(){
        this.props.setTitle(this.state.title)
    }
    render(){
        return(
            <div>
                <h1>Application Group</h1>
            </div>
        )
    }
}

const ApplicationGroup=connect(null,mapDispatchToProps)(ConnectedApplicationGroup)
export default ApplicationGroup;