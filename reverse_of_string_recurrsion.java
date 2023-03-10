//recursion
class ReverseIt{
    public String reverseString(String str){
        int l=str.length();
        if (l<=1){
            return str;
        }else{
            
            return reverseString(str.substring(l/2))+reverseString(str.substring(0,l/2));
        }
    }

    public String reversePara(String str){
        if (str.length()<=1){
            return str;
        }else{
            int sep_pos=str.indexOf(" ");
            if (sep_pos<0){
                return reverseString(str);
            }
            return reverseString(str.substring(0,sep_pos))+str.charAt(sep_pos)+reversePara(str.substring(sep_pos+1));
        }
    }
    public static void main(String[] args) {
        String str="Lorem ipsum dolor sit amet consectetur, adipisicing elit. Expedita laborum, vero, quae corporis ipsam aliquid nam excepturi laboriosam magnam dignissimos aliquam quis tempora veniam, consectetur eos nostrum molestias vitae? Blanditiis ipsa, labore numquam unde at cupiditate illum sit facilis incidunt molestias velit! Voluptate expedita corrupti voluptatum itaque. Laboriosam, dolorem enim tempore praesentium non magni aspernatur error vitae aliquid illum hic distinctio delectus quaerat explicabo! Aliquid quisquam quas quam animi tempore sit? Eius, incidunt atque cum accusamus illo, dolorem voluptates explicabo reiciendis aspernatur enim beatae, quidem aperiam facere doloremque ex quae mollitia eaque voluptatum libero deleniti quos ut amet magni. Odit, vero a! Accusantium, eaque voluptas, porro commodi delectus ipsam praesentium labore quia nihil exercitationem in? Temporibus, animi. Vero alias rem placeat blanditiis, a temporibus, porro est beatae aliquid ad, optio modi quaerat quos facilis eaque veritatis soluta quo rerum laudantium provident. Eveniet pariatur harum voluptates sint voluptatem, doloribus fuga. Fuga iure iste excepturi optio nemo libero cupiditate dolore tempora quae. Maiores minima quisquam praesentium numquam architecto a aliquam itaque! Fugit temporibus, id facere atque doloribus soluta veniam tempore incidunt aperiam quos optio, repellendus laudantium sed nihil cum molestiae distinctio, quisquam nostrum quae assumenda quo natus nisi. Facere, soluta. Velit ad error veniam est quod repellat eum suscipit, nulla voluptatem obcaecati, impedit ducimus! Cupiditate dolor saepe numquam, eos sint ratione iste mollitia facilis hic eum excepturi, adipisci optio? Amet, obcaecati, incidunt enim non excepturi similique facere cumque accusantium aut eius eum voluptatum distinctio omnis iste nisi veritatis odit rem nesciunt. Aliquam harum dignissimos cumque quae corrupti quod. Molestiae, illo! Ea molestiae, commodi facere libero non dolorem hic fugit, quaerat ipsa, delectus beatae? Minima ipsam tempora minus numquam corporis accusantium vitae velit, doloribus, voluptatibus culpa laboriosam modi, similique dolor vel suscipit quas reiciendis expedita. Inventore magni aliquid quos adipisci nobis ad, est provident consequatur vero, sunt dignissimos labore eos quibusdam repudiandae! Aperiam dolor possimus veritatis ipsa. Unde explicabo commodi, quibusdam quas ipsum inventore, aperiam autem perferendis reprehenderit consequatur quidem veritatis molestiae ab cum. Aliquid tempore ex in corrupti necessitatibus ducimus soluta repellat dignissimos, sit quisquam eius. Rerum unde illum officia, quis quod at tempora, ab culpa harum pariatur iure esse facere eveniet perferendis itaque exercitationem soluta nobis reiciendis. Similique facere asperiores quasi quo minus atque illum laborum explicabo inventore, provident adipisci dicta sunt aut quisquam illo in voluptas! Soluta impedit dolor sapiente corporis nemo accusantium, neque ex atque beatae natus facilis aliquam numquam sequi dolorem assumenda unde voluptatum voluptatem laboriosam inventore possimus ea voluptates, animi nisi facere! Obcaecati modi magnam perferendis deleniti, error, sequi sit suscipit nobis tempora eaque blanditiis! Nam cum sapiente minima placeat est, quo beatae distinctio tenetur quasi cumque ipsum, voluptatum porro in laudantium dolor odio. Maiores eaque totam, distinctio aliquam officia architecto voluptate qui tempore pariatur animi explicabo numquam libero illum quas! Est aliquid asperiores, ut voluptate magnam voluptates ipsum. Tenetur magnam est, eligendi officiis aperiam saepe, explicabo nemo dicta dolorem, quia eius distinctio provident corrupti ipsam sint maxime alias! Aspernatur tempore rem aliquid voluptate tenetur. Dolores accusamus illum veritatis perspiciatis, officiis iure saepe. Error soluta dolor dolore nobis recusandae quae sed quod dolores! Voluptatem, enim. Vel numquam fugit reiciendis nemo inventore dolores cum sunt? Ipsam asperiores, dolorem fuga perspiciatis dignissimos explicabo incidunt neque sit aperiam repellat! Suscipit accusantium impedit excepturi ad corrupti consequuntur vitae, facere, adipisci ratione, dolor itaque! Sed, qui? Necessitatibus cupiditate assumenda error deleniti ipsa soluta impedit harum amet facere eius vero nemo dignissimos aliquid, excepturi placeat. Explicabo eos molestiae ipsum accusamus! Dolorem doloremque aperiam vero obcaecati similique temporibus, eligendi laudantium quam ducimus suscipit harum omnis, debitis voluptate ipsum amet blanditiis? Nesciunt non beatae ad. Ratione corrupti officia tempora quidem quia nihil, pariatur doloremque magnam exercitationem consectetur esse dolorem quaerat, voluptas eveniet non nobis harum incidunt nesciunt nulla omnis, id impedit a ipsam sed. Possimus at laboriosam accusamus praesentium culpa, cum suscipit fugiat impedit autem sit, quidem neque dicta voluptatibus eos iure quia ducimus. Voluptatum dolor placeat beatae maiores fuga eum consequatur reprehenderit molestias officiis aperiam adipisci, illo alias facere, quod corporis soluta nam ea, odit quibusdam. Suscipit porro perspiciatis aut ut nihil, aliquid at consectetur iste animi beatae reprehenderit labore tempora exercitationem minus blanditiis ea vero fuga, vel consequuntur? Neque, recusandae.";
        // str="Rohit is a very intelligent boy";
        ReverseIt ri=new ReverseIt();
        String res=ri.reversePara(str);
        System.out.println(res);
    }
}
