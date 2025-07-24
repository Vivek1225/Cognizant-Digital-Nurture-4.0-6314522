import '../Stylesheets/mystyle.css';
import React from 'react';

export const CalculateScore = ({Name, School, Total, goal}) => {
    return (
        <div className="formatstyle">
            <h1><font color="Brown">Student Details : </font></h1>
            <div className="Name">
                <b><span>Name : </span></b>
                <span>{Name}</span>
            </div>
            <div className="School">
                <b><span>School : </span></b>
                <span>{School}</span>
            </div>
            <div className="Total">
                <b><span>Total : </span></b>
                <span>{Total}</span>
                <span> Marks</span>
            </div>
            <div className="Score">
                <b>Score : </b>
                <span>
                    {calc(Total, goal)}
                </span>
            </div>
        </div>
    );
}

const calc = (Total, goal) => {
    return percentToDecimal(Total / goal);
}

const percentToDecimal = (decimal) => {
    return (decimal * 100).toFixed(2) + "%";
}

export default CalculateScore;