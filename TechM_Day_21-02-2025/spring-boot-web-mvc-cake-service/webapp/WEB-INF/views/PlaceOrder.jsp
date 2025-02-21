<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cake Form</title>
<style>
/* Existing styles remain unchanged */
</style>
</head>
<body>
    <div id="wrap">
        <sf:form action="orderStatus" name='form' modelAttribute="cake" method="POST">
            <div class="cont_order">
               <fieldset>
                <legend>Make your cake!</legend>
                
                <label>Size Of the Cake</label> <br/>
                
                <sf:radiobutton path="selectedCake" id="selectedCake1" value="10" />
                <label class='radiolabel'>Round cake 6" - serves 8 people ($10)</label> <br/>
                
                <sf:radiobutton path="selectedCake" id="selectedCake2" value="15" />
                <label class='radiolabel'>Round cake 8" - serves 12 people ($15)</label> <br/>
                
                <sf:radiobutton path="selectedCake" id="selectedCake3" value="25" />
                <label class='radiolabel'>Round cake 10" - serves 16 people ($25)</label> <br/>
                
                <sf:radiobutton path="selectedCake" id="selectedCake4" value="30" />
                <label class='radiolabel'>Round cake 12" - serves 30 people ($30)</label> <br/>
                <sf:errors path="selectedCake" />
                
                <br/>
                <label>Filling Flavor</label>
                <sf:select path="flavor" id="flavor" items="${flavorList}" />
                
                <p> 
                	<label for='includeCandles' class="inlinelabel">Include Candles ($5)</label>
              		<sf:checkbox path="includeCandles" id="includeCandles"/>
                </p>
                <p>
                	<label class="inlinelabel" for='includeinscription'>Include Inscription ($5)</label>
                	<sf:checkbox path="includeinscription" id="includeinscription"/>
                	<sf:input path="theinscription" id="theinscription" placeholder="Enter Inscription" />
                </p>
                </fieldset>
            </div>
            
            <div class="cont_details">
                <fieldset>
                    <legend>Contact Details</legend>
                    
                    <label for='name'>Name</label>
                    <sf:input path="name" id="name" />
                    <sf:errors path="name" />
                    <br/>
                    
                    <label for='address'>Address</label>
                    <sf:input path="address" id="address" />
                    <sf:errors path="address" />
                    <br/>
                    
                    <label for='phonenumber'>Phone Number</label>
                    <sf:input path="phonenumber" id="phonenumber" />
                    <sf:errors path="phonenumber" />
                    <br/>
                </fieldset>
            </div>

            <input type="submit" value="Place Order" name="submit" />
        </sf:form>
    </div><!--End of wrap-->
</body>
</html>
