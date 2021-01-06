import React,{ Component } from "react";
import { connect } from "react-redux";
const mapDispatchToProps=(dispatch)=>{
    return{
        setTitle:(title)=>{
            dispatch({type:"SET_TITLE",payload:title})
        }
    }

}
class ConnectedGroup extends Component{
    state={
        title:"Group"
    }
   
    componentDidMount(){
        this.props.setTitle(this.state.title)
    }
    render(){
        return(
            <div>
                <h1>Group</h1>
            </div>
        )
    }
}


const Group=connect(null,mapDispatchToProps)(ConnectedGroup)
export default Group;