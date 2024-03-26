package com.java.model.taskPlanner;


public enum TaskType {
    BUG,
    FEATURE,
    STORY
}
//It denotes a special type of class that always extends the java.lang.Enum class.
//Constants defined this way make the code more readable, allow for compile-time checking,
// document the list of accepted values upfront, and avoid unexpected behavior due to invalid values being passed in
