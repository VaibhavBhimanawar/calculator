<apex:page controller="MyCalculator">
    <apex:form >
        <apex:pageBlock title="Simple Calculator">
            <apex:pageBlockSection columns="2">
                <apex:inputText value="{!val1}" label="First Number"/>
                <apex:inputText value="{!val2}" label="Second Number"/>
                
                <apex:selectList value="{!func}" size="1" label="Select Operation">
                    <apex:selectOptions value="{!operations}"/>
                </apex:selectList>

                <apex:commandButton value="Calculate" action="{!finds}" rerender="resultBlock"/>
            </apex:pageBlockSection>

            <apex:outputPanel id="resultBlock">
                <apex:pageBlockSection title="Result">
                    <apex:outputText value="Result: {!result}" style="font-weight:bold; font-size:16px;"/>
                </apex:pageBlockSection>
            </apex:outputPanel>
        </apex:pageBlock>
    </apex:form>
</apex:page>
