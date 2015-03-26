<center>
        <h1>Spring MVC - Send e-mail with attachments</h1>
        <form method="post" action="sendEmail.htm" enctype="multipart/form-data">
            <table border="0" width="80%">
                <tr>
                    <td>Email To:</td>
                    <td><input type="text" name="mailTo" size="65" /></td>
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td><input type="text" name="subject" size="65" /></td>
                </tr>
                <tr>
                    <td>Message:</td>
                    <td><textarea cols="50" rows="10" name="message"></textarea></td>
                </tr>
                <tr>
                    <td>Attach file:</td>
                    <td><input type="file" name="attachFile" size="60" /></td>
                </tr>            
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Send E-mail" />
                    </td>
                </tr>
            </table>
        </form>
    </center>